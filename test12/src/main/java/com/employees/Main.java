package com.employees;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Iterator;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        int totalSalaries = 0;
        try {
            System.out.println("Current working directory: " + System.getProperty("user.dir"));
            String people = new String(
                    Files.readAllBytes(Path.of("test12/src/main/java/com/employees/employees.json")));
            JSONObject jsonObject = new JSONObject(people);
            Iterator<String> keys = jsonObject.keys();

            Employee employee = null;
            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject person = jsonObject.getJSONObject(key);
                String role = person.optString("role", "Unknown");
                JSONObject details = person.optJSONObject("details");

                employee = switch (role) {
                    case "Programmer" -> new Programmer(person, 2300);
                    case "Manager" -> {
                        int orgSize = details.optInt("orgSize", 0);
                        int dr = details.optInt("dr", 0);
                        yield new Manager(person, 2500, orgSize, dr);
                    }
                    case "Analyst" -> {
                        int projCount = details.optInt("projectCount", 0);
                        yield new Analyst(person, 2200, projCount);
                    }
                    case "CEO" -> {
                        int avgStockPrice = details.optInt("avgStockPrice", 0);
                        yield new CEO(person, 5000, avgStockPrice);
                    }
                    default -> null;
                };
                System.out.println(
                        employee.toString());
                totalSalaries += employee.getSalary();
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        NumberFormat currencyInstance = NumberFormat
                .getCurrencyInstance();
        System.out.println(currencyInstance.format(totalSalaries));

    }
}
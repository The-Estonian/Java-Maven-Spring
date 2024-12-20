package com.employees;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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

            while (keys.hasNext()) {
                String key = keys.next();
                JSONObject person = jsonObject.getJSONObject(key);

                String firstname = person.optString("firstname", "Unknown");
                String lastname = person.optString("lastname", "Unknown");
                String dob = person.optString("dob", "Unknown");
                String role = person.optString("role", "Unknown");
                Date dateOfBirth = new Date();
                JSONObject details = person.optJSONObject("details");
                try {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("M/d/yyyy");
                    dateOfBirth = dateFormat.parse(dob);
                } catch (ParseException e) {
                    System.out.println("Invalid date format: " + e.getMessage());
                }
                if (role.contains("Programmer")) {
                    Programmer prog = new Programmer(firstname, lastname, dateOfBirth);
                    prog.setSalary(3000);
                    totalSalaries += 3000;
                    System.out.println(prog);
                }
                if (role.contains("Manager")) {
                    int orgSize = details.optInt("orgSize", 0);
                    int dr = details.optInt("dr", 0);
                    Manager manager = new Manager(firstname, lastname, dateOfBirth);
                    manager.setSalary(2500);
                    totalSalaries += 2500;
                    manager.setOrganizationSize(orgSize);
                    manager.setDr(dr);
                    System.out.println(manager);
                }
                if (role.contains("Analyst")) {
                    int projCount = details.optInt("projectCount", 0);
                    Analyst analyst = new Analyst(firstname, lastname, dateOfBirth, projCount);
                    analyst.setSalary(2200);
                    totalSalaries += 2200;
                    System.out.println(analyst);
                }
                if (role.contains("CEO")) {
                    int avgStockPrice = details.optInt("avgStockPrice", 0);
                    CEO ceo = new CEO(firstname, lastname, dateOfBirth, avgStockPrice);
                    ceo.setSalary(5000);
                    totalSalaries += 5000;
                    System.out.println(ceo);
                }

            }

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        NumberFormat currencyInstance = NumberFormat
                .getCurrencyInstance();
        System.out.println(currencyInstance.format(totalSalaries));

    }
}
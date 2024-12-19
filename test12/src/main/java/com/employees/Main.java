package com.employees;

import java.text.NumberFormat;
import java.util.Iterator;

import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        String people = """
                {
                    "1": {
                        "lastname": "Flinstone",
                        "firstname": "Fred",
                        "dob": "1/1/1900",
                        "role": "Programmer"
                        },
                    "2": {
                        "lastname": "Rubble",
                        "firstname": "Barney",
                        "dob": "2/2/1905",
                        "role": "Manager"
                        },
                    "3": {
                        "lastname": "Flinstone",
                        "firstname": "Wilma",
                        "dob": "3/3/1910",
                        "role": "Analyst"
                        },
                    "4": {
                        "lastname": "Rubble",
                        "firstname": "Betty",
                        "dob": "4/4/1915",
                        "role": "CEO"
                        }
                }""";

        int totalSalaries = 0;
        JSONObject jsonObject = new JSONObject(people);
        Iterator<String> keys = jsonObject.keys();

        while (keys.hasNext()) {
            String key = keys.next();
            JSONObject person = jsonObject.getJSONObject(key);

            String firstname = person.optString("firstname", "Unknown");
            String lastname = person.optString("lastname", "Unknown");
            String dob = person.optString("dob", "Unknown");
            String role = person.optString("role", "Unknown");

            System.out.println(String.format("""
                    First name: %s
                    Last name: %s
                    Date of Birth: %s
                    Role: %s
                    """, firstname, lastname, dob, role));
            totalSalaries += switch (role) {
                case "Programmer" -> {
                    yield 3000;
                }
                case "Manager" -> {
                    yield 3500;
                }
                case "Analyst" -> {
                    yield 2500;
                }
                case "CEO" -> {
                    yield 5000;
                }
                default -> 0;
            };
        }
        ;

        NumberFormat currencyInstance = NumberFormat
                .getCurrencyInstance();
        System.out.println(currencyInstance.format(totalSalaries));

    }
}
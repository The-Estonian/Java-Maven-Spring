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
                        "role": "Programmer",
                        "details": {
                            "locpd":2000,
                            "yoe":10,
                            "iq":140
                            }
                        },
                    "2": {
                        "lastname": "Flinstone2",
                        "firstname": "Fred2",
                        "dob": "1/1/1900",
                        "role": "Programmer",
                        "details": {
                            "locpd":1300,
                            "yoe":14,
                            "iq":100
                            }
                        },
                    "3": {
                        "lastname": "Rubble",
                        "firstname": "Barney",
                        "dob": "2/2/1905",
                        "role": "Manager",
                        "details": {
                            "orgSize":300,
                            "dr":10
                            }
                        },
                    "4": {
                        "lastname": "Rubble2",
                        "firstname": "Barney2",
                        "dob": "2/2/1905",
                        "role": "Manager",
                        "details": {
                            "orgSize":100,
                            "dr":4
                            }
                        },
                    "5": {
                        "lastname": "Flinstone",
                        "firstname": "Wilma",
                        "dob": "3/3/1910",
                        "role": "Analyst",
                        "details": {
                            "projectCount":3
                            }
                        },
                    "6": {
                        "lastname": "Flinstone2",
                        "firstname": "Wilma2",
                        "dob": "3/3/1910",
                        "role": "Analyst",
                        "details": {
                            "projectCount":5
                            }
                        },
                    "7": {
                        "lastname": "Rubble",
                        "firstname": "Betty",
                        "dob": "4/4/1915",
                        "role": "CEO",
                        "details": {
                            "avgStockPrice":300
                            }
                        },
                    "8": {
                        "lastname": "Rubble2",
                        "firstname": "Betty2",
                        "dob": "4/4/1915",
                        "role": "CEO",
                        "details": {
                            "avgStockPrice":200
                            }
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

            JSONObject details = person.optJSONObject("details");

            StringBuilder buildString = new StringBuilder();
            buildString.append("-----------------------------\n")
                    .append("First name: ")
                    .append(firstname)
                    .append("\nLast name: ")
                    .append(lastname)
                    .append("\nDate of Birth: ")
                    .append(dob)
                    .append("\nRole: ")
                    .append(role);
            if (role.contains("Programmer")) {
                int locpd = details.optInt("locpd", 0);
                int yoe = details.optInt("yoe", 0);
                int iq = details.optInt("iq", 0);
                buildString.append("\nLines of Code per day: ")
                        .append(locpd)
                        .append("\nYears of Experience: ")
                        .append(yoe)
                        .append("\nIQ: ")
                        .append(iq);
            }
            if (role.contains("Manager")) {
                int orgSize = details.optInt("orgSize", 0);
                int dr = details.optInt("dr", 0);
                buildString.append("\nOrganization size: ")
                        .append(orgSize)
                        .append("\nManager DR: ")
                        .append(dr);
            }
            if (role.contains("Analyst")) {
                int projCount = details.optInt("projectCount", 0);
                buildString.append("\nProject Count: ")
                        .append(projCount);
            }
            if (role.contains("CEO")) {
                int avgStockPrice = details.optInt("avgStockPrice", 0);
                buildString.append("\nAverage Stock Price: ")
                        .append(avgStockPrice);
            }

            System.out.println(buildString.toString());

            // System.out.println(String.format("""
            // -----------------------------
            // First name: %s
            // Last name: %s
            // Date of Birth: %s
            // Role: %s
            // - Lines per day: %s
            // - Years of Experience: %s
            // - IQ: %s
            // -----------------------------
            // """, firstname, lastname, dob, role, locpd, yoe, iq));

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
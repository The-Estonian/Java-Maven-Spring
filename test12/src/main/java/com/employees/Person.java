package com.employees;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.json.JSONObject;

public class Person {
    protected String firstName;
    protected String lastName;
    protected LocalDate dob;
    protected int salary;

    public Person(JSONObject person) {
        this.firstName = person.optString("firstname", "Unknown");
        this.lastName = person.optString("lastname", "Unknown");
        String dobString = person.optString("dob", "Unknown");
        try {
            DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/d/yyyy");
            this.dob = LocalDate.parse(dobString, dateFormat);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format: " + e.getMessage());
            this.dob = null;
        }
    }

}

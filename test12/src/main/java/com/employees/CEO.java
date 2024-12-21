package com.employees;

import java.time.LocalDate;

import org.json.JSONObject;

public class CEO extends Person implements Employee {
    int avgStockPrice;

    public CEO(JSONObject person, int salary, int avgStockPrice) {
        super(person);
        this.salary = salary;
        this.avgStockPrice = avgStockPrice;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAvgStockPrice() {
        return avgStockPrice;
    }

    public void setAvgStockPrice(int avgStockPrice) {
        this.avgStockPrice = avgStockPrice;
    }

    @Override
    public String toString() {
        return String.format("""
                CEO
                First name: %s
                Last name: %s
                Date of Birth: %s
                Salary: %s
                Average Stock price: %s
                """, firstName, lastName, dob, salary, avgStockPrice);
    }

}

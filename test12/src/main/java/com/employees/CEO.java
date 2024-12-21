package com.employees;

import java.time.LocalDate;

public class CEO extends Person implements Employee {
    int avgStockPrice;

    public CEO(String firstName, String lastName, LocalDate dob, int salary, int avgStockPrice) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
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

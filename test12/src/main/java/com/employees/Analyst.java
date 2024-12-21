package com.employees;

import java.time.LocalDate;

import org.json.JSONObject;

public class Analyst extends Person implements Employee {
    int projectCount;

    public Analyst(JSONObject person, int salary, int projectCount) {
        super(person);
        this.salary = salary;
        this.projectCount = projectCount;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
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

    public int getProjectCount() {
        return projectCount;
    }

    public void setProjectCount(int projectCount) {
        this.projectCount = projectCount;
    }

    @Override
    public String toString() {
        return String.format("""
                Analyst
                First name: %s
                Last name: %s
                Date of Birth: %s
                Salary: %s
                Project Count: %s
                """, firstName, lastName, dob, salary, projectCount);
    }

}

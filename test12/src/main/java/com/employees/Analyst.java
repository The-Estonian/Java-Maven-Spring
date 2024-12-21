package com.employees;

import java.util.Date;

public class Analyst implements Employee {
    String firstName;
    String lastName;
    Date dob;
    int salary;
    int projectCount;

    public Analyst(String firstName, String lastName, Date dob, int salary, int projectCount) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
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

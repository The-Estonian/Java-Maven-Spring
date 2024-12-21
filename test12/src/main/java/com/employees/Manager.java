package com.employees;

import java.time.LocalDate;

public class Manager extends Person implements Employee {
    int organizationSize;
    int dr;

    public Manager(String firstName, String lastName, LocalDate dob, int salary, int organizationSize, int dr) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
        this.salary = salary;
        this.organizationSize = organizationSize;
        this.dr = dr;
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

    public int getOrganizationSize() {
        return organizationSize;
    }

    public void setOrganizationSize(int organizationSize) {
        this.organizationSize = organizationSize;
    }

    public int getDr() {
        return dr;
    }

    public void setDr(int dr) {
        this.dr = dr;
    }

    @Override
    public String toString() {
        return String.format("""
                Programmer
                First name: %s
                Last name: %s
                Date of Birth: %s
                Salary:%s
                Organization Size: %s
                DR: %s
                """, firstName, lastName, dob, salary, organizationSize, dr);
    }

}

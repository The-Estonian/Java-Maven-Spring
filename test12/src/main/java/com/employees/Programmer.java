package com.employees;

import java.time.LocalDate;
import java.util.Date;

public class Programmer extends Person implements Employee {

    public Programmer(String firstName, String lastName, LocalDate dob, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
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

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("""
                Programmer
                First name: %s
                Last name: %s
                Date of Birth: %s
                Salary:%s
                """, firstName, lastName, dob, salary);
    }

}

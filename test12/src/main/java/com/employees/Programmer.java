package com.employees;

import java.util.Date;

public class Programmer {
    String firstName;
    String lastName;
    Date dob;
    int salary;

    public Programmer(String firstName, String lastName, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
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

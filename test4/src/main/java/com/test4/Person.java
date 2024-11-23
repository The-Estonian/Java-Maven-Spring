package com.test4;

import java.time.LocalDate;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Address address;
    private Person spouse;
    private Pet pet;

    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public Person getSpouse() {
        return spouse;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setSpouse(Person spouse) {
        this.spouse = spouse;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    @Override
    public String toString() {
        return "Person [firstName=" + firstName + ",\n lastName=" + lastName + ",\n dob=" + dob + ",\n address=" + address
                + ",\n spouse=" + spouse + ",\n pet=" + pet + "]";
    }
    
}

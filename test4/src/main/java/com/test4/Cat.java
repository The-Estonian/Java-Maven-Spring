package com.test4;

import java.time.LocalDate;

public class Cat extends Pet {

    public Cat(String name, LocalDate dob) {
        super(name, dob);
    }

    public Cat() {
    }

    @Override
    public void meow() {
        System.out.println("Meow Meow");
    }
}

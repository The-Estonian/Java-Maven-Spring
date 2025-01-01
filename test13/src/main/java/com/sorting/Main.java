package com.sorting;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Programmer first = new Programmer("Second", "First", LocalDate.of(1999, 1, 1), 5000);
        Programmer second = new Programmer("First", "First", LocalDate.of(1999, 1, 1), 5000);
        List<Programmer> proList = new ArrayList<>(List.of(first, second));
        proList.sort((Programmer a, Programmer b) -> {
            return a.getFirstName().compareTo(b.getFirstName());
        });
        for (int i = 0; i < proList.size(); i++) {
            System.out.println(proList.get(i).getFirstName());
        }

        for (Programmer prog : proList) {
            System.out.println(prog.getFirstName());
        }
    }
}
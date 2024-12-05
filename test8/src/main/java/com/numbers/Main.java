package com.numbers;

public class Main {
    public static void main(String[] args) {
        System.err.println(200 % 10);
        System.err.println(7f / 4); // float
        System.err.println((double) 7 / 4); // double 64bit
        System.err.println(7d / 4); // double 32bit
        int x = 5;
        System.err.println(x++);
        System.err.println(++x);
        boolean mybool = true;
        System.err.println(mybool); // true
        System.err.println(!mybool); // false
        System.err.println(Math.abs(-51.55));
        System.err.println(Math.pow(2, 3));
        System.err.println((int) (Math.random() * 10));
    }
}
package com.numbers;

import java.security.SecureRandom;
import java.util.Random;

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

        Random random = new Random();
        System.err.println(random.nextInt(10));

        Random srandom = new SecureRandom();
        System.err.println(srandom.nextInt(10));

        System.err.println("Are of circle");

        System.err.println(Area.calcAreaOfCircle(3));

    }
}
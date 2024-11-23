package com.basic;

public class App {
    public static void main(String[] args) {
        String text1 = "Hello";
        String text2 = "Not Hello!";
        String finalString = new StringBuilder().append(text1).append(" ")
                .append(text2).toString();

        System.out.println(finalString);
    }
}

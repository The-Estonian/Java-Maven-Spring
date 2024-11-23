package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        // String input = "Bat";
        // String input1 = "cat";
        // String input2 = "http://www.dev.ee";
        // String input3 = "333-333-3333";
        String input4 = "1.232.333.2365";
        // System.out.println(input.matches("Bat"));
        // System.out.println(input.matches("bat"));
        // System.out.println(input.matches("[bB]at"));
        // System.out.println(input.matches("[aA-fF]at"));
        // System.out.println(input.matches("[a-fA-F]at"));
        // System.out.println(input.matches("[^c]at")); // true c not found
        // System.out.println(input1.matches("[^c]at")); // false c not allowed
        // System.out.println(input3.matches("\\d{3}[-.\\d]\\d{3}[-.\\d]\\d{4}")); //
        // number check
        // System.out.println(input2.matches("http://www.[\\w]*.ee")); // starts with
        // http:// and ends with .ee
        // System.out.println(input1.matches("*.ee")); // ends with .ee
        // System.out.println(input4.matches("(\\d{1}[-.,\\s])?(\\d{3}[-.,\\s]?){1,2}\\d{4}"));
        // // check 4th input
        String phoneRegex = "(\\d{1}[-.,\\s])?(\\d{3}[-.,\\s]?){1,2}\\d{4}";
        Pattern phoneNum = Pattern.compile(phoneRegex);
        Matcher phoneBool = phoneNum.matcher(input4);
        if (phoneBool.matches()) {
            System.out.println(phoneBool.group(1));
            System.out.println(phoneBool.group(2));
        }
    }
}
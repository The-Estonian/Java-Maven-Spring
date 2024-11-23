package com.calculator;

import com.calculator.calc.Calculator;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator(1, 1);

        System.out.println(calc.add());
    }
}

package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void addingZeroPlusZero() {
        Calculator calc = new Calculator();
        int num = calc.add(0, 0);
        assertEquals(0, num, "Expecting 0 + 0 to be 0");
    }

    @Test
    public void addingOnePlusOne() {
        Calculator calc = new Calculator();
        int num = calc.add(1, 1);
        assertEquals(2, num, "Expecting 1 + 1 to be 2");
    }
}

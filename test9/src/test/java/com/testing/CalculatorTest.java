package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private final Calculator calc = new Calculator();

    @Test
    public void addingZeroPlusZero() {
        int num = calc.add(0, 0);
        assertEquals(0, num, "Expecting 0 + 0 to be 0");
    }

    @Test
    public void addingOnePlusOne() {
        int num = calc.add(1, 1);
        assertEquals(2, num, "Expecting 1 + 1 to be 2");
    }

    @Test
    public void addingOnePlusMinusOne() {
        int num = calc.add(1, -1);
        assertEquals(0, num, "Expecting 1 + 1 to be 0");
    }

    @Test
    public void addingMinusOnePlusMinusOne() {
        int num = calc.add(-1, -1);
        assertEquals(-2, num, "Expecting 1 + 1 to be 0");
    }
}
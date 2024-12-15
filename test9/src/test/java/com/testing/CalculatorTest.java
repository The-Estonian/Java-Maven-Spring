package com.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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
    public void addingMaxIntPlusOne() {
        int num = calc.add(Integer.MAX_VALUE, 1);
        assertNotEquals(Integer.MAX_VALUE + 1L, num, "Expecting 2147483647 + 1 to be 2147483648");
    }

    @Test
    public void subtractZeroMinusZero() {
        int num = calc.subtract(0, 0);
        assertEquals(0, num, "Expecting 0 - 0 to be 0");
    }

    @Test
    public void subtractOneMinusOne() {
        int num = calc.subtract(1, 1);
        assertEquals(0, num, "Expecting 1 - 1 to be 0");
    }

    @Test
    public void multiplyZeroTimesZero() {
        int num = calc.multiply(0, 0);
        assertEquals(0, num, "Expecting 0 * 0 to be 0");
    }

    @Test
    public void multiplyOneTimesOne() {
        int num = calc.multiply(1, 1);
        assertEquals(1, num, "Expecting 1 * 1 to be 1");
    }

    @Test
    public void divideZeroByZero() {
        assertThrows(ArithmeticException.class, () -> calc.divide(0, 0), "Expecting dividing by zero exception.");
    }

    @Test
    public void divideOneByOne() {
        int num = calc.divide(1, 1);
        assertEquals(1, num, "Expecting 1 * 1 to be 1");
    }

    @Test
    public void annuityExample() {
        String answer = calc.calcAnnuity("22000", 7, ".06", 1);
        assertEquals("$184,664.43", answer);
    }

    @Test
    public void annuityPractice2() {
        String answer = calc.calcAnnuity("1200", 10, ".08", 4);
        assertEquals("$72,482.38", answer);
    }
}
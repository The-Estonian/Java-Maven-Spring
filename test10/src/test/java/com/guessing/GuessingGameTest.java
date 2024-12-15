package com.guessing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GuessingGameTest {

    private GuessingGame game;
    private int randomNum;

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
        randomNum = game.getRandomNumber();
    }

    @Test
    public void testSimpleWinSituation() {
        String message = game.guess(3);
        assertEquals("You got it!", message);
    }

    @Test
    public void testWrongNegGuessSituation() {
        String message = game.guess(-3);
        assertEquals("You didn't get it!", message);
    }

    @Test
    public void testWrongPosGuessSituation() {
        String message = game.guess(randomNum + 1);
        assertNotEquals("You didn't get it!", message);
    }

    @Test
    public void testRandomNumberGeneration() {
        int[] intArr = new int[10];
        for (int i = 0; i < 100; i++) {
            int generatedNumber = game.getRandomNumber();
            intArr[generatedNumber] = 1;
        }
        int sum = 0;
        for (int j = 0; j < intArr.length; j++) {
            sum += intArr[j];
        }
        assertEquals(10, sum);
    }
}

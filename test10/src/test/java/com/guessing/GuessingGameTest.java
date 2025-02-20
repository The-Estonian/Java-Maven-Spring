package com.guessing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class GuessingGameTest {

    private static final int GAME_RANDOMNESS_RETRIES = 50;
    private GuessingGame game;
    private int randomNum;

    private void makeThreeWrongGuesses() {
        game.guess(-3);
        game.guess(-3);
        game.guess(-3);
    }

    @BeforeEach
    void setUp() {
        game = new GuessingGame();
        randomNum = game.getRandomNumber();
    }

    @Test
    public void testSimpleWinSituation() {
        String message = game.guess(game.getRandomNumber());
        assertEquals("You won with 4 tries left!", message);
    }

    @Test
    public void testWrongNegGuessSituation() {
        String message = game.guess(-3);
        assertEquals("You didn't get it and you have 3 tries left. The number was too low", message);
    }

    @Test
    public void testWrongHighGuessSituation() {
        String message = game.guess(11);
        assertEquals("You didn't get it and you have 3 tries left. The number was too high", message);
    }

    @Test
    public void testWrongPosGuessSituation() {
        String message = game.guess(randomNum + 1);
        assertEquals("You didn't get it and you have 3 tries left. The number was too high", message);
    }

    @RepeatedTest(10)
    public void testRandomNumberGeneration() {
        int[] intArr = new int[10];
        for (int i = 0; i < GAME_RANDOMNESS_RETRIES; i++) {
            GuessingGame gameInstance = new GuessingGame();
            int generatedNumber = gameInstance.getRandomNumber();
            intArr[generatedNumber] = 1;
        }
        int sum = 0;
        for (int j = 0; j < intArr.length; j++) {
            sum += intArr[j];
        }
        assertEquals(10, sum);
    }

    @Test
    public void testFourWrongGuesses() {
        makeThreeWrongGuesses();
        String feedback = game.guess(-3);
        assertEquals(feedback, "You didn't get it and you have 0 tries left. The number was too low");
    }

    @Test
    public void testThreeWrongGuessesAndOneCorrect() {
        makeThreeWrongGuesses();
        String feedback = game.guess(randomNum);
        assertEquals(feedback, "You won with 1 tries left!");
    }

    @Test
    public void testTwoWrongGuessesAndTwoCorrect() {
        game.guess(-3);
        game.guess(-3);
        game.guess(randomNum);
        String feedback = game.guess(randomNum);
        assertEquals(feedback, "You won with 2 tries left!");
    }
}

package com.guessing;

import java.util.Random;

public class GuessingGame {

    private final int randomNumber = new Random().nextInt(10);

    public String guess(int num) {
        if (num == getRandomNumber()) {
            return "You got it!";
        } else {
            return "You didn't get it!";
        }

    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

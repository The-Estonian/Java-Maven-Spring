package com.guessing;

import java.util.Random;

public class GuessingGame {

    private final int randomNumber = new Random().nextInt(10);
    private int counter = 0;

    public String guess(int num) {
        if (num == getRandomNumber()) {
            return String.format("You won with %s tries left!", 4 - counter);
        } else {
            counter++;
            return String.format("You didn't get it and you have %s tries left.", 4 - counter);
        }

    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

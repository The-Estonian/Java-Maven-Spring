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
            String highLow = "";
            if (num < getRandomNumber()){
                highLow = "low";
            } else {
                highLow = "high";
            }
            return String.format("You didn't get it and you have %d tries left. The number was too %s", 4 - counter, highLow);
        }

    }

    public int getRandomNumber() {
        return randomNumber;
    }
}

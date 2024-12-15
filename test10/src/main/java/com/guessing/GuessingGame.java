package com.guessing;

public class GuessingGame {

    public String guess(int num) {
        if (num < 0) {
            return "You didn't get it!";
        } else {
            return "You got it!";
        }

    }

    public int getRandomNumber() {
        return (int) (Math.random() * 10);
    }
}

package com.guessing;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    private final int randomNumber = new Random().nextInt(10);
    private int counter = 0;

    public String guess(int num) {
        if (num == getRandomNumber()) {
            return String.format("You won with %s tries left!", 3 - counter);
        } else {
            counter++;
            String highLow = "";
            if (num < getRandomNumber()) {
                highLow = "low";
            } else {
                highLow = "high";
            }
            return String.format("You didn't get it and you have %d tries left. The number was too %s", 4 - counter,
                    highLow);
        }

    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GuessingGame game = new GuessingGame();

        for (int i = 0; i < 3; i++) {
            System.out.print("Please guess a number: ");
            int num = scanner.nextInt();
            scanner.nextLine();
            String answer = game.guess(num);
            System.out.println(answer);
            if (game.getRandomNumber() == num) {
                break;
            }
        }
        scanner.close();
    }
}

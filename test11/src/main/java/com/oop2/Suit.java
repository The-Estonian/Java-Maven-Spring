package com.oop2;

public enum Suit {
    CLUBS('♣'),
    DIAMONDS('♦'),
    HEARTS('♥'),
    SPADES('♠');

    private char symbol;

    private Suit(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public String toString() {
        return Character.toString(this.symbol);
    }

}

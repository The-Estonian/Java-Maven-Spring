package com.oop2;

public enum Rank {
    ACE,
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    QUEEN,
    KING;

    public Integer getValue() {
        return switch (this) {
            case JACK, QUEEN, KING -> 10;
            default -> ordinal() + 1;
        };
    }
}

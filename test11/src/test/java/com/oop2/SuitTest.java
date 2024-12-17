package com.oop2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SuitTest {

    @Test
    void heartPrintsHeart() {
        assertEquals("♥", Suit.HEARTS.toString());
    }

}

package com.oop2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RankTest {

    @Test
    void getValueOfKing() {
        assertEquals(10, Rank.KING.getValue());
    }
}

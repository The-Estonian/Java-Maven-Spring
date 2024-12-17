package com.oop2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CardTest {

    @Test
    void canGetValueOfATwoCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.TWO);
        assertEquals(2, card1.getRank().getValue());
    }

    @Test
    void canGetValueOfAThreeCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.THREE);
        assertEquals(3, card1.getRank().getValue());
    }

    @Test
    void canGetValueOfAnAceCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.ACE);
        assertEquals(1, card1.getRank().getValue());
    }

    @Test
    void canGetValueOfAJackCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.JACK);
        assertEquals(10, card1.getRank().getValue());
    }

    @Test
    void canGetValueOfAKingCard() {
        Card card1 = new Card(Suit.DIAMONDS, Rank.KING);
        assertEquals(10, card1.getRank().getValue());
    }

}

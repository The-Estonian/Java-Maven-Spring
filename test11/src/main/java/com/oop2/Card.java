package com.oop2;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Card(String suit, String rank) {
        this.suit = Suit.valueOf(suit.toUpperCase());
        this.rank = Rank.valueOf(rank.toUpperCase());
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.rank.toString(), this.suit.toString());
    }

    public static void main(String[] args) {

        Card card1 = new Card(Suit.CLUBS, Rank.JACK);
        Card card2 = new Card("spades", "queen");

        Card card3 = new Card(Suit.DIAMONDS, Rank.FOUR);
        Card card4 = new Card(Suit.SPADES, Rank.FIVE);
        System.out.println(card1);
        System.out.println(card2);
        System.out.println(card3);
        System.out.println(card4);
    }

}

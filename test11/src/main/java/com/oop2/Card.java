package com.oop2;

public class Card {
    private Suit suit;
    private Rank rank;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
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

    

    public static void main(String[] args) {
        Card card1 = new Card(Suit.CLUBS, Rank.TWO); // süda
        Card card2 = new Card(Suit.CLUBS, Rank.THREE); // risti

        Card card3 = new Card(Suit.DIAMONDS, Rank.FOUR); // ärtu
        Card card4 = new Card(Suit.SPADES, Rank.FIVE); // poti

    }

}

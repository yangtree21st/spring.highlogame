package com.zipcodewilmington.bakery.models;

import javax.persistence.Entity;

@Entity
public class Card {

    enum Rank {
        LOW_ACE(1),
        TWO(2),
        THREE(3),
        FOUR(4),
        FIVE(5),
        SIX(6),
        SEVEN(7),
        EIGHT(8),
        NINE(9),
        TEN(10),
        JACK(11),
        QUEEN(12),
        KING(13);

        private final int value;

        Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return this.value;
        }
    }

    enum Suit {
        HEARTS("♥"),
        DIAMONDS("♦"),
        CLUBS("♣"),
        SPADES("♠");

        private String cardGraphic;

        Suit(String cardGraphic) {
            this.cardGraphic = cardGraphic;
        }

        public String getCardGraphic() {
            return cardGraphic;
        }

        public static int length() {
            return values().length;
        }
    }


    private final Rank rank;
    private final Suit suit;

    public Card(Rank rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public int getValue() {
        return rank.getValue();
    }

    public String toString() {
        return getRank().name() + " of " + getSuit().name();
    }
}

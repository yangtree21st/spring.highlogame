package com.zipcodewilmington.bakery.models.cardgames.utils;

public enum Suit {
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

package com.zipcodewilmington.bakery.models.cardgames.utils;

import java.util.Stack;

public class Deck {

    Stack<Card> cardStack;

    public Deck() {
    }

    public Deck(Stack<Card> cardStack) {
        this.cardStack = cardStack;
    }

    public Stack<Card> getCardStack() {
        return cardStack;
    }

    public void setCardStack(Stack<Card> cardStack) {
        this.cardStack = cardStack;
    }
}

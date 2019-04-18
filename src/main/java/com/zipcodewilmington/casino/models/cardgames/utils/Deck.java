package com.zipcodewilmington.casino.models.cardgames.utils;

import javax.persistence.*;
import java.util.List;
import java.util.Stack;


@Entity
public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToMany(fetch = FetchType.LAZY)
    List<Card> cardStack;

    public Deck() {
    }

    public Deck(Stack<Card> cardStack) {
        this.cardStack = cardStack;
    }

    public List<Card> getCardStack() {
        return cardStack;
    }

    public void setCardStack(List<Card> cardStack) {
        this.cardStack = cardStack;
    }
}

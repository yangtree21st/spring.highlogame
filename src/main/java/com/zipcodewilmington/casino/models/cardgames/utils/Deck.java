package com.zipcodewilmington.casino.models.cardgames.utils;

import javax.persistence.*;
import java.util.List;
import java.util.Stack;


@Entity
public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    List<Card> cardList;

    public Deck() {
    }

    public Deck(Stack<Card> cardStack) {
        this.cardList = cardStack;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public Card pop() {
        Card firstCard = cardList.get(0);
        cardList.remove(firstCard);
        return firstCard;
    }

    public void push(Card card) {
        cardList.add(card);
    }

    public Card peek() {
        return cardList.get(0);
    }

    public Boolean isEmpty() {
        return cardList.isEmpty();
    }

    public void populate() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                push(new Card(rank, suit));
            }
        }
    }
}

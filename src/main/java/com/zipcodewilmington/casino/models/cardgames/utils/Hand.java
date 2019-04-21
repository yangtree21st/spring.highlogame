package com.zipcodewilmington.casino.models.cardgames.utils;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Hand {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Card> cardList;

    public Hand() {
        this(null, new ArrayList<>());
    }

    public Hand(Long id, List<Card> cardList) {
        this.cardList = cardList;
    }

    public List<Card> getCardList() {
        return cardList;
    }

    public void setCardList(List<Card> cardList) {
        this.cardList = cardList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void addCard(Card card) {
        cardList.add(card);
    }
}

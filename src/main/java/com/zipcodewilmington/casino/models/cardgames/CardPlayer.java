package com.zipcodewilmington.casino.models.cardgames;


import com.zipcodewilmington.casino.models.Account;
import com.zipcodewilmington.casino.models.cardgames.utils.Hand;

import javax.persistence.*;

@MappedSuperclass
public class CardPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String name;

    @OneToOne
    Hand hand
            ;
    @OneToOne
    Account account;

    public CardPlayer() {
    }

    public CardPlayer(Account account, String name) {
        this.account = account;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

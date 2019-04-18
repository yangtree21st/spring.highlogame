package com.zipcodewilmington.casino.models.cardgames;


import com.zipcodewilmington.casino.models.Account;
import com.zipcodewilmington.casino.models.cardgames.utils.Hand;

import javax.persistence.*;

@MappedSuperclass
public class CardPlayer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @OneToOne
    Hand hand;

    @OneToOne
    Account account;

    public CardPlayer() {
        this(null, new Hand(), new Account());
    }

    public CardPlayer(Long id, Hand hand, Account account) {
        this.id = id;
        this.hand = hand;
        this.account = account;
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
}

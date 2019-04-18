package com.zipcodewilmington.casino.models.cardgames.highlo;

import com.zipcodewilmington.casino.models.Account;
import com.zipcodewilmington.casino.models.cardgames.CardPlayer;
import com.zipcodewilmington.casino.models.cardgames.utils.Hand;

import javax.persistence.Entity;

@Entity
public class HighLoPlayer extends CardPlayer {
    public HighLoPlayer(Long id, Hand hand, Account account){
        super(id, hand, account);
    }
}

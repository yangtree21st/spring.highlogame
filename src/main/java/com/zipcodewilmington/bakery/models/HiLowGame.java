package com.zipcodewilmington.bakery.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;
@Entity
public class HiLowGame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    Deck deck;
    List<HiLowGame> playerList;

    public HiLowGame() {
    }

    public HiLowGame(Long id, Deck deck, List<HiLowGame> playerList) {
        this.id = id;
        this.deck = deck;
        this.playerList = playerList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public List<HiLowGame> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<HiLowGame> playerList) {
        this.playerList = playerList;
    }

    public HiLoPlayer findById(Long accountId) {
        return null;
    }
}

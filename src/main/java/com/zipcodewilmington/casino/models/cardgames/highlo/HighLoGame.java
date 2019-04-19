package com.zipcodewilmington.casino.models.cardgames.highlo;


import com.zipcodewilmington.casino.models.cardgames.utils.Deck;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
public class HighLoGame {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Deck deck;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<HighLoPlayer> playerList;

    public HighLoGame() {
        this(null, new Deck(), new ArrayList<>());
    }

    public HighLoGame(Long id, Deck deck, List<HighLoPlayer> playerList) {
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

    public List<HighLoPlayer> getPlayerList() {
        return playerList;
    }

    public void setPlayerList(List<HighLoPlayer> playerList) {
        this.playerList = playerList;
    }

    public HighLoPlayer findById(Long accountId) {
        return null;
    }
}

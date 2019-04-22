package com.zipcodewilmington.casino.models.cardgames.utils;

import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoPlayer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HighLoResult {
    private Card flippedCard;
    private Map<HighLoPlayer, String> result;

    public HighLoResult() {
        result = new HashMap<>();
    }

    public HighLoResult(Card flippedCard) {
        this();
        this.flippedCard = flippedCard;
    }

    public Card getFlippedCard() {
        return flippedCard;
    }

    public void setFlippedCard(Card flippedCard) {
        this.flippedCard = flippedCard;
    }

    public Map<HighLoPlayer, String> getResult() {
        return result;
    }

    public void setResult(Map<HighLoPlayer, String> result) {
        this.result = result;
    }

    public void addResult(HighLoPlayer player, String resultString) {
        this.result.put(player, resultString);
    }

    public String getResult(HighLoPlayer player) {
        return result.get(player);
    }
}

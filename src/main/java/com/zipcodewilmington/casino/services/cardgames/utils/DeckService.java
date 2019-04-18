package com.zipcodewilmington.casino.services.cardgames.utils;

import com.zipcodewilmington.casino.models.cardgames.utils.Deck;
import com.zipcodewilmington.casino.repositories.cardgames.utils.DeckRepository;
import com.zipcodewilmington.springutils.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeckService extends AbstractService<Deck, Long> {
    @Autowired
    public DeckService(DeckRepository repository) {
        super(repository);
    }

    @Override
    public Deck update(Long gameId, Deck newHighLowGame) {
        Deck deck = super.read(gameId);
        deck.setCardStack(newHighLowGame.getCardStack());
        repository.save(deck);
        return deck;
    }
}

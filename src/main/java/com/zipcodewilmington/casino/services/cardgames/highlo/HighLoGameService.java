package com.zipcodewilmington.casino.services.cardgames.highlo;

import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoGame;
import com.zipcodewilmington.casino.models.cardgames.utils.Deck;
import com.zipcodewilmington.casino.repositories.cardgames.highlo.HighLoGameRepository;
import com.zipcodewilmington.springutils.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class HighLoGameService extends AbstractService<HighLoGame, Long> {
    @Autowired
    public HighLoGameService(HighLoGameRepository repository) {
        super(repository);
    }

    @Override
    public HighLoGame update(Long gameId, HighLoGame newHighLoGame) {
        HighLoGame originalHighLoGame = super.read(gameId);
        originalHighLoGame.setId(newHighLoGame.getId());
        originalHighLoGame.setDeck(newHighLoGame.getDeck());
        return super.repository.save(originalHighLoGame);
    }

    public HighLoGame create() {
        return super.create(new HighLoGame());
    }
}

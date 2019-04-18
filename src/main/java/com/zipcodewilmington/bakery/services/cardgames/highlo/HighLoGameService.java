package com.zipcodewilmington.bakery.services.cardgames.highlo;

import com.zipcodewilmington.bakery.models.cardgames.highlo.HighLowGame;
import com.zipcodewilmington.bakery.repositories.cardgames.highlo.HighLoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HighLoGameService {
    private HighLoGameRepository repository;
    @Autowired
    public HighLoGameService(HighLoGameRepository repository) {
        this.repository = repository;
    }

    public HighLowGame show(Long gameId) {
        return repository.findById(gameId).get();
    }

    public HighLowGame create(HighLowGame highLowGame) {
        return repository.save(highLowGame);
    }

    public Boolean delete(Long gameId) {
        repository.deleteById(gameId);
        return true;
    }

    public HighLowGame update(Long gameId, HighLowGame newHighLowGame) {
        HighLowGame originalHighLowGame = repository.findById(gameId).get();
        originalHighLowGame.setId(newHighLowGame.getId());
        originalHighLowGame.setDeck(newHighLowGame.getDeck());
        return repository.save(originalHighLowGame);
    }
}

package com.zipcodewilmington.bakery.services;

import com.zipcodewilmington.bakery.models.HiLowGame;
import com.zipcodewilmington.bakery.repositories.HiLoGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiLoGameService {
    private HiLoGameRepository repository;
    @Autowired
    public HiLoGameService(HiLoGameRepository repository) {
        this.repository = repository;
    }

    public HiLowGame show(Long gameId) {
        return repository.findById(gameId).get();
    }

    public HiLowGame create(HiLowGame hiLowGame) {
        return repository.save(hiLowGame);
    }

    public Boolean delete(Long gameId) {
        repository.deleteById(gameId);
        return true;
    }

    public HiLowGame update(Long gameId, HiLowGame newHiLowGame) {
        HiLowGame originalHiLowGame = repository.findById(gameId).get();
        originalHiLowGame.setId(newHiLowGame.getId());
        originalHiLowGame.setDeck(newHiLowGame.getDeck());
        return repository.save(originalHiLowGame);
    }
}

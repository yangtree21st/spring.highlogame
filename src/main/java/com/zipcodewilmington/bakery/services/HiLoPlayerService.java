package com.zipcodewilmington.bakery.services;

import com.zipcodewilmington.bakery.models.HiLowGame;
import com.zipcodewilmington.bakery.models.HiLoPlayer;
import com.zipcodewilmington.bakery.repositories.HiLoGameRepository;
import com.zipcodewilmington.bakery.repositories.HiLoPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HiLoPlayerService {
    private HiLoGameRepository gameRepo;
    private HiLoPlayerRepository playerRepo;

    @Autowired
    public HiLoPlayerService(HiLoPlayerRepository playerRepo, HiLoGameRepository gameRepo) {
        this.playerRepo = playerRepo;
        this.gameRepo = gameRepo;
    }

    public HiLoPlayer create(HiLoPlayer hiLowPlayer) {
        return playerRepo.save(hiLowPlayer);
    }

    public HiLoPlayer show (Long accountId) {
        HiLowGame highLowGame = gameRepo.findById(accountId).get();
        return highLowGame.findById(accountId);
    }

    public Boolean delete(Long gameId) {
        playerRepo.deleteById(gameId);
        return true;
    }

    public HiLoPlayer update(Long gameId, HiLoPlayer newHiLowPlayer) {
        HiLoPlayer originalHiLowPlayer = playerRepo.findById(gameId).get();
        originalHiLowPlayer.setName(newHiLowPlayer.getName());
        originalHiLowPlayer.setAccount(newHiLowPlayer.getAccount());
        return playerRepo.save(originalHiLowPlayer);
    }
}

package com.zipcodewilmington.casino.services.cardgames.highlo;

import com.zipcodewilmington.casino.models.cardgames.highlo.HighLowGame;
import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoPlayer;
import com.zipcodewilmington.casino.repositories.cardgames.highlo.HighLoGameRepository;
import com.zipcodewilmington.casino.repositories.cardgames.highlo.HighLoPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HighLoPlayerService {
    private HighLoGameRepository gameRepo;
    private HighLoPlayerRepository playerRepo;

    @Autowired
    public HighLoPlayerService(HighLoPlayerRepository playerRepo, HighLoGameRepository gameRepo) {
        this.playerRepo = playerRepo;
        this.gameRepo = gameRepo;
    }

    public HighLoPlayer create(HighLoPlayer hiLowPlayer) {
        return playerRepo.save(hiLowPlayer);
    }

    public HighLoPlayer show (Long accountId) {
        HighLowGame highLowGame = gameRepo.findById(accountId).get();
        return highLowGame.findById(accountId);
    }

    public Boolean delete(Long gameId) {
        playerRepo.deleteById(gameId);
        return true;
    }

    public HighLoPlayer update(Long gameId, HighLoPlayer newHiLowPlayer) {
        HighLoPlayer originalHiLowPlayer = playerRepo.findById(gameId).get();
        originalHiLowPlayer.setName(newHiLowPlayer.getName());
        originalHiLowPlayer.setAccount(newHiLowPlayer.getAccount());
        return playerRepo.save(originalHiLowPlayer);
    }
}

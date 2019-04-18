package com.zipcodewilmington.casino.services.cardgames.highlo;

import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoPlayer;
import com.zipcodewilmington.casino.repositories.cardgames.highlo.HighLoPlayerRepository;
import com.zipcodewilmington.springutils.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HighLoPlayerService extends AbstractService<HighLoPlayer, Long> {
    @Autowired
    public HighLoPlayerService(HighLoPlayerRepository playerRepo) {
        super(playerRepo);
    }

    @Override
    public HighLoPlayer update(Long id, HighLoPlayer newData) {
        HighLoPlayer originalHiLowPlayer = super.repository.findById(id).get();
        originalHiLowPlayer.setAccount(newData.getAccount());
        originalHiLowPlayer.setHand(newData.getHand());
        return super.repository.save(originalHiLowPlayer);
    }
}

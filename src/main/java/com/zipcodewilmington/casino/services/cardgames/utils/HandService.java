package com.zipcodewilmington.casino.services.cardgames.utils;

import com.zipcodewilmington.casino.models.cardgames.utils.Hand;
import com.zipcodewilmington.casino.repositories.cardgames.utils.HandRepository;
import com.zipcodewilmington.springutils.AbstractService;

public class HandService extends AbstractService<Hand, Long> {
    public HandService(HandRepository repository) {
        super(repository);
    }

    @Override
    public Hand update(Long id, Hand newData) {
        Hand hand = read(id);
        hand.setCardList(newData.getCardList());
        return hand;
    }
}

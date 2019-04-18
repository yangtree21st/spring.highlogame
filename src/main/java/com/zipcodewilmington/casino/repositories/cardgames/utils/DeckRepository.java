package com.zipcodewilmington.casino.repositories.cardgames.utils;

import com.zipcodewilmington.casino.models.cardgames.utils.Deck;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends CrudRepository<Deck, Long> {
}

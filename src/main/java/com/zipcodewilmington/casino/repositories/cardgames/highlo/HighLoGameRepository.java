package com.zipcodewilmington.casino.repositories.cardgames.highlo;

import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoGame;
import org.springframework.data.repository.CrudRepository;

public interface HighLoGameRepository extends CrudRepository<HighLoGame, Long> {
}

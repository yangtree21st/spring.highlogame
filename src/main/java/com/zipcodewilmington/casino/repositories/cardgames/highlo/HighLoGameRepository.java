package com.zipcodewilmington.casino.repositories.cardgames.highlo;

import com.zipcodewilmington.casino.models.cardgames.highlo.HighLowGame;
import org.springframework.data.repository.CrudRepository;

public interface HighLoGameRepository extends CrudRepository<HighLowGame, Long> {
}

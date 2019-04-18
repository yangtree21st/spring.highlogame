package com.zipcodewilmington.bakery.repositories.cardgames.highlo;

import com.zipcodewilmington.bakery.models.cardgames.highlo.HighLowGame;
import org.springframework.data.repository.CrudRepository;

public interface HighLoGameRepository extends CrudRepository<HighLowGame, Long> {
}

package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.HighLowGame;
import org.springframework.data.repository.CrudRepository;

public interface HighLoGameRepository extends CrudRepository<HighLowGame, Long> {
}

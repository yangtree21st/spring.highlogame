package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.HiLowGame;
import org.springframework.data.repository.CrudRepository;

public interface HiLoGameRepository extends CrudRepository<HiLowGame, Long> {
}

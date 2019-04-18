package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.HighLoPlayer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HighLoPlayerRepository extends CrudRepository<HighLoPlayer, Long> {
}

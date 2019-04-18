package com.zipcodewilmington.bakery.repositories.cardgames.highlo;

import com.zipcodewilmington.bakery.models.cardgames.highlo.HighLoPlayer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HighLoPlayerRepository extends CrudRepository<HighLoPlayer, Long> {
}

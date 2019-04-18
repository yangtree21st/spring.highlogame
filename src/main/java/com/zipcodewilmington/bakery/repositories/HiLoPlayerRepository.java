package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.HiLoPlayer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HiLoPlayerRepository extends CrudRepository<HiLoPlayer, Long> {
}

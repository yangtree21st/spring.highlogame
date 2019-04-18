package com.zipcodewilmington.casino.repositories.cardgames.utils;

import com.zipcodewilmington.casino.models.cardgames.utils.Hand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HandRepository extends CrudRepository<Hand, Long> {
}

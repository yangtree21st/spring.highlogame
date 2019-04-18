package com.zipcodewilmington.bakery.repositories;

import com.zipcodewilmington.bakery.models.Account;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends CrudRepository<Account,Long> {
}

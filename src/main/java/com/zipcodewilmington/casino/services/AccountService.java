package com.zipcodewilmington.casino.services;

import com.zipcodewilmington.casino.models.Account;
import com.zipcodewilmington.casino.repositories.AccountRepository;
import com.zipcodewilmington.springutils.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService extends AbstractService<Account, Long> {
    @Autowired
    public AccountService(AccountRepository repository) {
        super(repository);
    }

    public Account update(Long id, Account newAccountData){
        Account originalAccount = repository.findById(id).get();
        originalAccount.setName(newAccountData.getName());
        originalAccount.setBalance(newAccountData.getBalance());
        return  repository.save(originalAccount);
    }
}

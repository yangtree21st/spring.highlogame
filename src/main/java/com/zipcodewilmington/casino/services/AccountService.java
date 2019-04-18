package com.zipcodewilmington.casino.services;

import com.zipcodewilmington.casino.models.Account;
import com.zipcodewilmington.casino.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    private AccountRepository repository;
    
    @Autowired
    public AccountService(AccountRepository repository) {
        this.repository = repository;
    }

    public Account  create(Account account){ return repository.save(account);
                                           }

    public Account show(Long id){ return  repository.findById(id).get();
                                }

    public Boolean delete(Long id){
        repository.deleteById(id);
        return true;
    }
    public Account update(Long id, Account newAccountData){
        Account originalAccount = repository.findById(id).get();
        originalAccount.setName(newAccountData.getName());
        originalAccount.setBalance(newAccountData.getBalance());
        return  repository.save(originalAccount);
    }
}

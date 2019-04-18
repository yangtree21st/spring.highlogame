package com.zipcodewilmington.bakery.controllers;

import com.zipcodewilmington.bakery.models.Account;
import com.zipcodewilmington.bakery.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * This class exposes endpoints to manipulate account entities
 */
@Controller
public class AccountController {

    private AccountService service;

    @Autowired
    public AccountController(AccountService service) {
        this.service = service;
    }


    @PostMapping(value = "/accounts")
    public ResponseEntity<Account> create(@RequestBody Account account) {
        Account createdAccount = service.create(account);
        ResponseEntity<Account> response = new ResponseEntity<>(createdAccount, HttpStatus.CREATED);
        return response;
    }

    @GetMapping(value = "/accounts/{id}")
    public ResponseEntity<Account> show(@PathVariable Long id) {
        Account shownAccount = service.show(id);
        ResponseEntity<Account> response = new ResponseEntity<>(shownAccount, HttpStatus.OK);
        return response;
    }

    @DeleteMapping(value = "/accounts/{id}")
    public ResponseEntity<Account> delete(@PathVariable Long id) {
        Account deletedAccount = service.show(id);
        service.delete(id);
        ResponseEntity<Account> response = new ResponseEntity<>(deletedAccount, HttpStatus.OK);
        return response;
    }

    @PutMapping(value = "/accounts/{id}")
    public ResponseEntity<Account> update(
            @PathVariable Long id,
            @RequestBody Account newAccountData) {
        Account updatedAccount = service.update(id, newAccountData);
        ResponseEntity<Account> response = new ResponseEntity<>(updatedAccount, HttpStatus.OK);
        return response;
    }
}

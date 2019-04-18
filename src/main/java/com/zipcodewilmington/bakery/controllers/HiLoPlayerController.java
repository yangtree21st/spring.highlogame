package com.zipcodewilmington.bakery.controllers;

import com.zipcodewilmington.bakery.models.HiLoPlayer;
import com.zipcodewilmington.bakery.services.HiLoPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HiLoPlayerController {

    private HiLoPlayerService hiLoPlayerService;

    @Autowired
    public HiLoPlayerController(HiLoPlayerService hiLoPlayerService) {
        this.hiLoPlayerService = hiLoPlayerService;
    }
    @PostMapping (name = "/hiloplayers")
    public ResponseEntity<HiLoPlayer> create(@RequestBody HiLoPlayer hiLoPlayer) {
        return new ResponseEntity<>(hiLoPlayerService.create(hiLoPlayer), HttpStatus.CREATED);
    }
    @GetMapping(name = "/hiloplayers/{id}")
    public ResponseEntity<HiLoPlayer>  show(@PathVariable Long accountId) {
        return new ResponseEntity<>(hiLoPlayerService.show(accountId), HttpStatus.OK);
    }

    @PutMapping(name = "/hiloplayers/{id}")
    public ResponseEntity<HiLoPlayer>  update(@PathVariable Long gameId, @RequestBody HiLoPlayer hiLoPlayer) {
        return new ResponseEntity<>(hiLoPlayerService.update(gameId, hiLoPlayer), HttpStatus.OK);
    }

    @DeleteMapping(name = "/hiloplayers/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Long gameId) {
        return new ResponseEntity<>(hiLoPlayerService.delete(gameId), HttpStatus.OK);
    }
}

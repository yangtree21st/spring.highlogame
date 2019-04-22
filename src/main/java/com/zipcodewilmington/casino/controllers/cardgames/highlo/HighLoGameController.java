package com.zipcodewilmington.casino.controllers.cardgames.highlo;

import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoGame;
import com.zipcodewilmington.casino.models.cardgames.utils.Card;
import com.zipcodewilmington.casino.models.cardgames.utils.HighLoResult;
import com.zipcodewilmington.casino.services.cardgames.highlo.HighLoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


@RestController
@RequestMapping(value = "/games/highlo")
public class HighLoGameController {

    private HighLoGameService service;//service is always Singleton,is a bean.

    @Autowired// Telling IOC to inject Beans.Dependency Injection//it updated in moc database.
    public HighLoGameController(HighLoGameService service) {
        this.service = service;
    }


    @PutMapping("/{id}/choice")
    public ResponseEntity<HighLoResult> makeChoice(@PathVariable Long id, @RequestBody Map<String, Object> request) {
        long playerId = (Integer) request.get("playerId");
        String choice = (String) request.get("choice");

        return new ResponseEntity<>(service.makeChoice(id, playerId, choice), HttpStatus.OK);
    }


    @PostMapping("/")
    public ResponseEntity<HighLoGame> create(@RequestBody HighLoGame highLoGame) {
        return new ResponseEntity<>(service.create(highLoGame), HttpStatus.CREATED);
    }

    @PostMapping("/new")
    public ResponseEntity<HighLoGame> create() {
        return new ResponseEntity<>(service.create(), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<HighLoGame> read(@PathVariable Long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HighLoGame> update(@PathVariable Long id, @RequestBody HighLoGame highLoGame) {
        return new ResponseEntity<>(service.update(id, highLoGame), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HighLoGame> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }

    @PutMapping("/{id}/deal")
    public ResponseEntity<HighLoGame> dealCards(@PathVariable Long id) {
        return new ResponseEntity<>(service.dealCard(id), HttpStatus.OK);
    }


}


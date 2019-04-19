package com.zipcodewilmington.casino.controllers.cardgames.highlo;

import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoGame;
import com.zipcodewilmington.casino.services.cardgames.highlo.HighLoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping(value = "games/highlo")
public class HighLoGameController {

    private HighLoGameService service;//service is always Singleton,is a bean.

    @Autowired// Telling IOC to inject Beans.Dependency Injection//it updated in moc database.
    public HighLoGameController(HighLoGameService service) {
        this.service = service;
    }


    @GetMapping("/{id}")
    public ResponseEntity<HighLoGame> show(@PathVariable Long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<HighLoGame> create(@RequestBody HighLoGame highLoGame) {
        return new ResponseEntity<>(service.create(highLoGame), HttpStatus.CREATED);
    }

    @PostMapping("/new")
    public ResponseEntity<HighLoGame> create() {
        return new ResponseEntity<>(service.create(), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HighLoGame> update(@PathVariable Long id, @RequestBody HighLoGame highLoGame) {
        return new ResponseEntity<>(service.update(id, highLoGame), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HighLoGame> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}


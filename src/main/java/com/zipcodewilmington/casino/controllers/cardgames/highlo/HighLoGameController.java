package com.zipcodewilmington.casino.controllers.cardgames.highlo;

import com.zipcodewilmington.casino.models.cardgames.highlo.HighLowGame;
import com.zipcodewilmington.casino.services.cardgames.highlo.HighLoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
//@CrossOrigin(IPAddress)
@RequestMapping(value = "games/highlo")
public class HighLoGameController {

    private HighLoGameService service;//service is always Singleton,is a bean.

    @Autowired// Telling IOC to inject Beans.Dependency Injection//it updated in moc database.
    public HighLoGameController(HighLoGameService service) {
        this.service = service;
    }


    @GetMapping("/{id}")
    public ResponseEntity<HighLowGame> show(@PathVariable Long id) {
        return new ResponseEntity<>(service.read(id), HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<HighLowGame> create(@RequestBody HighLowGame highLowGame) {
        return new ResponseEntity<>(service.create(highLowGame), HttpStatus.CREATED);
    }

    @PostMapping("/new")
    public ResponseEntity<HighLowGame> create() {
        return new ResponseEntity<>(service.create(), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HighLowGame> update(@PathVariable Long id, @RequestBody HighLowGame highLowGame) {
        return new ResponseEntity<>(service.update(id, highLowGame), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HighLowGame> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}

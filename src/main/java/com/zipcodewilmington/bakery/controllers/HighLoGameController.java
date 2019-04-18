package com.zipcodewilmington.bakery.controllers;

import com.zipcodewilmington.bakery.models.HiLowGame;
import com.zipcodewilmington.bakery.services.HiLoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
//@CrossOrigin(IPAddress)

public class HighLoGameController {

    private HiLoGameService service;//service is always Singleton,is a bean.

    @Autowired// Telling IOC to inject Beans.Dependency Injection//it updated in moc database.
    public HighLoGameController(HiLoGameService service) {
        this.service = service;
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/hilogames/")
//    public ResponseEntity<Iterable<HiLoGame>> index() {
//        return new ResponseEntity<>(service.index(), HttpStatus.OK);
//    }

    @GetMapping("/games/{id}")
    public ResponseEntity<HiLowGame> show(@PathVariable Long id) {
        return new ResponseEntity<HiLowGame>(service.show(id), HttpStatus.OK);
    }

    @PostMapping("/games")
    public ResponseEntity<HiLowGame> create(@RequestBody HiLowGame hiLowGame) {
        return new ResponseEntity<HiLowGame>(service.create(hiLowGame), HttpStatus.CREATED);
    }

    @PutMapping("/games/{id}")
    public ResponseEntity<HiLowGame> update(@PathVariable Long id, @RequestBody HiLowGame hiLowGame) {
        return new ResponseEntity<>(service.update(id, hiLowGame), HttpStatus.OK);
    }

    @DeleteMapping("/games/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}

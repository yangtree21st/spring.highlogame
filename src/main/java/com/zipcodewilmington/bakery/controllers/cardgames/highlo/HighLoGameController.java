package com.zipcodewilmington.bakery.controllers.cardgames.highlo;

import com.zipcodewilmington.bakery.models.cardgames.highlo.HighLowGame;
import com.zipcodewilmington.bakery.services.cardgames.highlo.HighLoGameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
//@CrossOrigin(IPAddress)

public class HighLoGameController {

    private HighLoGameService service;//service is always Singleton,is a bean.

    @Autowired// Telling IOC to inject Beans.Dependency Injection//it updated in moc database.
    public HighLoGameController(HighLoGameService service) {
        this.service = service;
    }

//    @RequestMapping(method = RequestMethod.GET, value = "/hilogames/")
//    public ResponseEntity<Iterable<HiLoGame>> index() {
//        return new ResponseEntity<>(service.index(), HttpStatus.OK);
//    }

    @GetMapping("/games/{id}")
    public ResponseEntity<HighLowGame> show(@PathVariable Long id) {
        return new ResponseEntity<HighLowGame>(service.show(id), HttpStatus.OK);
    }

    @PostMapping("/games")
    public ResponseEntity<HighLowGame> create(@RequestBody HighLowGame highLowGame) {
        return new ResponseEntity<HighLowGame>(service.create(highLowGame), HttpStatus.CREATED);
    }

    @PutMapping("/games/{id}")
    public ResponseEntity<HighLowGame> update(@PathVariable Long id, @RequestBody HighLowGame highLowGame) {
        return new ResponseEntity<>(service.update(id, highLowGame), HttpStatus.OK);
    }

    @DeleteMapping("/games/{id}")
    public ResponseEntity<Boolean> destroy(@PathVariable Long id) {
        return new ResponseEntity<>(service.delete(id), HttpStatus.OK);
    }
}

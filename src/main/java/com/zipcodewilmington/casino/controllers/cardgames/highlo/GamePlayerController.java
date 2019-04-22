package com.zipcodewilmington.casino.controllers.cardgames.highlo;


import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "games/highlo")
public class GamePlayerController {

    @Autowired
    private GamePlayerService service;

    @PostMapping(value = "/{gameId}/players")
    public ResponseEntity<HighLoGame> addPlayers(@PathVariable long gameId, @RequestBody List<Long> playerIds) {
        return new ResponseEntity<>(service.addPlayers(gameId, playerIds), HttpStatus.OK);

    }
}

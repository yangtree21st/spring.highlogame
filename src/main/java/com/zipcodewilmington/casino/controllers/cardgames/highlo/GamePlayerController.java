package com.zipcodewilmington.casino.controllers.cardgames.highlo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "games/highlo")
public class GamePlayerController {

    @Autowired
    private GamePlayerService service;

    @PostMapping(value = "/{gameId}/players")
    public void addPlayers(@PathVariable long gameId, @RequestBody List<Long> playerIds) {
        service.addPlayers(gameId, playerIds);

    }
    @PostMapping
    public void addPlayers(@PathVariable Long gameId, @RequestBody  List<Long>playerIds){

    }
}

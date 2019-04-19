package com.zipcodewilmington.casino.controllers.cardgames.highlo;

import com.zipcodewilmington.casino.services.cardgames.highlo.GamePlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "games/highlo")
public class GamePlayerController {
   @Autowired
    private GamePlayerService gamePlayerService;


    public GamePlayerController(GamePlayerService gamePlayerService) {
        this.gamePlayerService = gamePlayerService;
    }
    @PostMapping
    public void addPlayers(@PathVariable Long gameId, @RequestBody  List<Long>playerIds){

    }
}

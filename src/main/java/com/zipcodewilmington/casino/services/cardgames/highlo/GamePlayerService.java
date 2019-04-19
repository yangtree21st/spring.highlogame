package com.zipcodewilmington.casino.services.cardgames.highlo;


import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoGame;
import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoPlayer;
import com.zipcodewilmington.casino.repositories.cardgames.highlo.HighLoPlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import java.util.ArrayList;
import java.util.List;

@Service
public class GamePlayerService {
    @Autowired
    private HighLoPlayerRepository playerRepository;

    @Autowired
    private HighLoPlayerRepository gameRepository;



    public void addPlayer(long gameId, List<Long> playerIds){
        HighLoPlayer game = gameRepository.findById(gameId).get();

        Iterable<HighLoPlayer> players = playerRepository.findAllById(playerIds);

        List<HighLoPlayer> list = new ArrayList<>();
        for(HighLoPlayer p: players){
            list.add(p);
        }
        game.setPlayersList(list);
    }

        gameRepository.save
}

//package com.zipcodewilmington.casino.controllers.cardgames.highlo;
//
//import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoGame;
//import com.zipcodewilmington.casino.models.cardgames.highlo.HighLoPlayer;
//import com.zipcodewilmington.casino.repositories.cardgames.highlo.HighLoGameRepository;
//import com.zipcodewilmington.casino.repositories.cardgames.highlo.HighLoPlayerRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class GamePlayerService {
//    @Autowired
//    private HighLoPlayerRepository playerRepository;
//
//    @Autowired
//    private HighLoGameRepository gameRepository;
//
//
//
//    public void addPlayers(Long gameId, List<Long> playerIds) {
//        HighLoGame game = gameRepository.findById(gameId).get();
//        List<HighLoPlayer> list = fetchPlayers(playerIds);
//        game.setPlayerList(list);
//
//        gameRepository.save(game);
//
//    }
//
//    private List<HighLoPlayer> fetchPlayers(List<Long> playerIds) {
//        Iterable<HighLoPlayer> players = playerRepository.findAllById(playerIds);
//
//        List<HighLoPlayer> list = new ArrayList<>();
//        for(HighLoPlayer p : players) {
//            list.add(p);
//        }
//        return list;
//    }
//}

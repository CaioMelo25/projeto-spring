package com.auladev.dslist.services;

import java.util.List;
import com.auladev.dslist.dto.GameDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auladev.dslist.dto.GameMinDTO;
import com.auladev.dslist.entities.Game;
import com.auladev.dslist.repositories.GameRepository;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    
    }
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List <GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;

    }

}

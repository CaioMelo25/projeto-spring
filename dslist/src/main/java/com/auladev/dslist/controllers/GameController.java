package com.auladev.dslist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.auladev.dslist.dto.GameMinDTO;
import com.auladev.dslist.entities.Game;
import com.auladev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List <GameMinDTO> findAll() {
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }

}

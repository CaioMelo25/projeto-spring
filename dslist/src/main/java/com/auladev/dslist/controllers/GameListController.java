package com.auladev.dslist.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;

import com.auladev.dslist.dto.GameListDTO;
import com.auladev.dslist.dto.GameMinDTO;

import com.auladev.dslist.services.GameListService;
import com.auladev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;
    @GetMapping
    public List <GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll();
        return result;
    }

     @GetMapping(value = "/{listId}/games")
    public List <GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gameService.findbyList(listId);
        return result;
    }
}

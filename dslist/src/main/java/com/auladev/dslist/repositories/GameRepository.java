package com.auladev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.auladev.dslist.entities.Game;

public interface GameRepository extends JpaRepository <Game, Long> {

}

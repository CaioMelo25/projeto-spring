package com.auladev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.auladev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository <GameList, Long> {

}

package com.igotforever.dslist.repositories;

import com.igotforever.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository <Game, Long> {

}

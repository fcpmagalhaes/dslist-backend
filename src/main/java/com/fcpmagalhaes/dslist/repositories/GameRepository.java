package com.fcpmagalhaes.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fcpmagalhaes.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}

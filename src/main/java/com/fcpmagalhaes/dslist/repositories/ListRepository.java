package com.fcpmagalhaes.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fcpmagalhaes.dslist.entities.GameList;

public interface ListRepository extends JpaRepository<GameList, Long>{

}

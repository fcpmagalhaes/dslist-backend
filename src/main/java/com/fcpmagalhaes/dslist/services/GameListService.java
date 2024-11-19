package com.fcpmagalhaes.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fcpmagalhaes.dslist.dto.GameListDTO;
import com.fcpmagalhaes.dslist.entities.GameList;
import com.fcpmagalhaes.dslist.repositories.ListRepository;

@Service
public class GameListService {
	
	@Autowired
	private ListRepository gameListRepository;
	
//	@Transactional(readOnly = true)
//	public GameDTO findById(Long id) {
//		Game result = gameRepository.findById(id).get();
//		return new GameDTO(result);
//	}
	
	@Transactional(readOnly = true)
	public List<GameListDTO> findAll() {
		List<GameList> result = gameListRepository.findAll();
		return result.stream().map(x -> new GameListDTO(x)).toList();
	}
	
	

}

package com.ipl.service;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipl.Player;
import com.ipl.dto.PlayerDto;
import com.ipl.repo.PlayerRepo;
import com.ipl.service.PlayerServiceImpl;
@Service
public class PlayerService implements PlayerServiceImpl{

	@Autowired
	private PlayerRepo pr;
	@Override
	public boolean createNewPlayer(PlayerDto playerDto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Collection<Player> getAllPlayers() {
		return pr.findAll();
		
	}

	@Override
	public Player getPlayerByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}

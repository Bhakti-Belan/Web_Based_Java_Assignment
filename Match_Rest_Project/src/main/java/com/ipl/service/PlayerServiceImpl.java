package com.ipl.service;

import java.util.Collection;

import com.ipl.Player;
import com.ipl.dto.PlayerDto;

public interface PlayerServiceImpl {

	boolean createNewPlayer(PlayerDto playerDto);
	Collection<Player> getAllPlayers();
	
	Player getPlayerByName(String name);
	
} 

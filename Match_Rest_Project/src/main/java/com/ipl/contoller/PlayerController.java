package com.ipl.contoller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.Player;
import com.ipl.service.PlayerServiceImpl;

@RestController
@RequestMapping("/player")
public class PlayerController {

	@Autowired
	private PlayerServiceImpl ps;
	@GetMapping("/all")
	public ResponseEntity<?>getAllPlayers()
	{
		Collection<Player> players=ps.getAllPlayers();
		if(CollectionUtils.isEmpty(players))
		{
			return new ResponseEntity<>("No Players Available",HttpStatus.BAD_REQUEST);
		}
		else
		{
			//return new ResponseEntity<>(players,HttpStatus.NO_CONTENT);
			return ResponseEntity.ok(players);
		}
	}
}

package com.ipl.contoller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.entity.Team;
import com.ipl.service.TeamService;
import com.ipl.service.TeamServiceInterface;

@RestController
@RequestMapping("/team")
public class TeamController {
	@Autowired
	private TeamServiceInterface ts;
	@PostMapping("/add")
	public ResponseEntity<?> createNewTeam(@RequestBody Team team)
	{
		try {
			if(ts.createTeam(team))
			{
				System.out.println("Team Added Succsessfully!!!");
				return new ResponseEntity<>("Team AddedSuccessFully",HttpStatus.CREATED);
			}
			else
			{
				System.out.println("Failed To Add");
				return new ResponseEntity<>("Team AddedSuccessFully",HttpStatus.BAD_REQUEST);
				
			}
			
		} catch (Exception e) {
			return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		
	}

}
	@GetMapping("/all")
	public ResponseEntity<?> getAllTeams()
	{
		Collection<Team> teams=ts.allTeams();
		if(CollectionUtils.isEmpty(teams))
		{
			return new ResponseEntity<>("Teams Not Available",HttpStatus.NO_CONTENT);
		}
		else
		{
			return new ResponseEntity<>(teams,HttpStatus.OK);
		}
	}
	@GetMapping("/name/{name}")
	public ResponseEntity<?> getTeamByName(@PathVariable String name)
	{
		Team team=null;
		try {
			team=ts.getTeamByName(name);

			if(ObjectUtils.isEmpty(team))
			{
				return new ResponseEntity<>("Team Not Available",HttpStatus.NOT_FOUND);
			}
			else
			{
				return new ResponseEntity<>(team,HttpStatus.OK);
			}
		}
			
			
			
		 catch (Exception e) {
			 return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		}

		
		
		
	}
	@GetMapping("/id/{id}")
	public ResponseEntity<?> getTeamById(@PathVariable Integer id)
	{
		Team team=null;
		try {
			team=ts.getTeamById(id);

			if(ObjectUtils.isEmpty(team))
			{
				return new ResponseEntity<>("Team Not Available",HttpStatus.NO_CONTENT);
			}
			else
			{
				return new ResponseEntity<>(team,HttpStatus.OK);
			}
			
		}
			
			
			
		 catch (Exception e) {
			 return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
		 }
			

		
	}
}

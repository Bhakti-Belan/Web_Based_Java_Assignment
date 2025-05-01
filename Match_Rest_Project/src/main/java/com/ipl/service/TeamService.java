package com.ipl.service;

import java.awt.print.Book;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.ipl.entity.Team;
import com.ipl.exception.ResourceNotFoundException;
import com.ipl.repo.TeamRepo;

@Service
public class TeamService implements TeamServiceInterface {

	@Autowired
	private TeamRepo tr;
	@Override
	public boolean createTeam(Team team) {
	
		if(!ObjectUtils.isEmpty(tr.findByName(team.getName())))
		{
			throw new ResourceAlreadyExistsException("Team With Name "+team.getName()+" already Exists");
		}
		Team savedTeam=tr.save(team);
			
		if(!ObjectUtils.isEmpty(savedTeam))
		{
			return true;
		}
		else
		{
			return false;
		}		
	}

	@Override
	public Collection<Team> allTeams() {
		
		return tr.findAll();
	}

	@Override
	public Team getTeamById(Integer id) {
		
		Optional<Team> fTeam= tr.findById(id);
		Team team=fTeam.get();
	    if(ObjectUtils.isEmpty(team))
	    {
	    	throw new ResourceNotFoundException("Team not found!!!");
	    }
	    else
		return team;
	}

	@Override
	public Team getTeamByName(String name) {
	
	Team fTeam= tr.findByName(name);
	    if(ObjectUtils.isEmpty(fTeam))
	    {
	    	throw new ResourceNotFoundException("Team not found!!!");
	    }
	    else
		return fTeam;
	}
	 


}

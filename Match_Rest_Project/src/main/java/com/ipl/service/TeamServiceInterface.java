package com.ipl.service;

import java.util.Collection;

import com.ipl.entity.Team;

public interface TeamServiceInterface {
	boolean createTeam(Team t);
	Collection<Team> allTeams();
	Team getTeamById(Integer id);
	Team getTeamByName(String name);

	

}

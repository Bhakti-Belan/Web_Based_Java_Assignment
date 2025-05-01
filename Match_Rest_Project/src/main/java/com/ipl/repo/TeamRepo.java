package com.ipl.repo;


import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import com.ipl.entity.Team;

public interface TeamRepo extends JpaRepository<Team,Integer> {
	 Team findByName(String name);

}

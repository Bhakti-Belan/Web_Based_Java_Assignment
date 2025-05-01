package com.ipl.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ipl.Player;

public interface PlayerRepo extends JpaRepository<Player, Integer> {

}

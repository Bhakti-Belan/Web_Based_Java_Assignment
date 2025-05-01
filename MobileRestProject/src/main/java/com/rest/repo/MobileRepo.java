package com.rest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.entity.Mobile;

public interface MobileRepo extends JpaRepository<Mobile,Integer> {

	
}

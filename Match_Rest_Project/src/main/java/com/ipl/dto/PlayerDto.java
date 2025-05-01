package com.ipl.dto;

import com.ipl.Specialization;
import com.ipl.entity.Team;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

public class PlayerDto {
	private String name;
	private String city;
	private Specialization specialization;
	private String teamName;
	public PlayerDto(String name, String city, Specialization specialization, String teamName) {
		super();
		this.name = name;
		this.city = city;
		this.specialization = specialization;
		this.teamName = teamName;
	}
	public PlayerDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Specialization getSpecialization() {
		return specialization;
	}
	public void setSpecialization(Specialization specialization) {
		this.specialization = specialization;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}

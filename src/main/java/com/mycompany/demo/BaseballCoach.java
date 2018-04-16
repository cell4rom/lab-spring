package com.mycompany.demo;

import org.springframework.beans.factory.annotation.Value;

import com.mycompany.demo.service.SportService;

public class BaseballCoach implements Coach {

	private SportService sportService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;

	public BaseballCoach(SportService _sportService) {
		sportService = _sportService;
	}

	public String getPlayer() {
		return sportService.getPlayer();
	}

	public String getDailyWorkout() {
		return null;
	}

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}
}

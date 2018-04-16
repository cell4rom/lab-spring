package com.mycompany.demo;

import org.springframework.stereotype.Component;

import com.mycompany.demo.service.SportService;

@Component
public class BaseballCoach implements Coach {

	private SportService sportService;

	public BaseballCoach(SportService _sportService) {
		sportService = _sportService;
	}

	public String getPlayer() {
		return sportService.getPlayer();
	}

	public String getDailyWorkout() {
		return null;
	}

}

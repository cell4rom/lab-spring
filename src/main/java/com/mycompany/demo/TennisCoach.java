package com.mycompany.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mycompany.demo.service.TennisCoachService;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	TennisCoachService tennisCoachService ;
	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	public String getPlayer() {
		return tennisCoachService.getPlayer();
	}
	
}

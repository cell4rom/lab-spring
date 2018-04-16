package com.mycompany.demo;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {

	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getPlayer() {
		return null;
	}

}









package com.mycompany.demo;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	public String getPlayer() {
		return null;
	}

}











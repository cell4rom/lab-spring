package com.mycompany.demo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {

	
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}

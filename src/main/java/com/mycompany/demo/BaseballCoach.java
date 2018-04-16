package com.mycompany.demo;

import org.springframework.stereotype.Component;

@Component("myBaseballCoach")
public class BaseballCoach implements Coach {
	
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

}









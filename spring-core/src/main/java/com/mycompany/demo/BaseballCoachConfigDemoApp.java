package com.mycompany.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BaseballCoachConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		BaseballCoach theCoach = context.getBean("baseballCoach", BaseballCoach.class);

		// call a method on the bean
		System.out.println(theCoach.getPlayer());
		
		// call our new swim coach methods
		System.out.println("email: "+ theCoach.getEmail());
		
		System.out.println("team: "+ theCoach.getTeam());

	}

}

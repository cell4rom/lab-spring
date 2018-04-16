package com.mycompany.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BaseballCoachConfigDemoApp {

	public static void main(String[] args) {
		
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		Coach theCoach = context.getBean("baseballCoach", Coach.class);

		// call a method on the bean
		System.out.println(theCoach.getPlayer());

	}

}

package com.mycompany.demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read spring config java class
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);

		// get the bean from spring container
		Coach theCoach1 = context.getBean("tennisCoach", Coach.class);

		Coach theCoach2 = context.getBean("baseballCoach", Coach.class);

		System.out.println("tennisCoach 1 : " + theCoach1.getPlayer());
		System.out.println("tennisCoach 2 : " + theCoach2.getPlayer());

	}

}

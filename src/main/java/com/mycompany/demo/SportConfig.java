package com.mycompany.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mycompany.demo.service.SportService;
import com.mycompany.demo.service.Impl.SportServiceImpl;

@Configuration
//@ComponentScan("com.mycompany.demo")
public class SportConfig {
	
	@Bean
	public SportService mySportService() {
		return new SportServiceImpl() ;
	}

	@Bean
	public Coach baseballCoach() {
		BaseballCoach myBaseballCoach = new BaseballCoach(mySportService());
		
		return myBaseballCoach;
	}
}

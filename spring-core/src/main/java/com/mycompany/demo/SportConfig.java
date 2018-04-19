package com.mycompany.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.mycompany.demo.service.SportService;
import com.mycompany.demo.service.Impl.SportServiceImpl;

@Configuration
//@ComponentScan("com.mycompany.demo")
@PropertySource("classpath:sport.properties")
public class SportConfig {
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer
					propertySourcesPlaceHolderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
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

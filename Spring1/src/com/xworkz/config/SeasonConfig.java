package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.things.Season;

@ComponentScan
@Configuration("com.xworkz")
public class SeasonConfig {
	public SeasonConfig() {
		System.out.println("registering another season using spring");
	}

	@Bean
	public Season sunny() {
		Season season = new Season();
		season.setName("summer");
		season.setDuration(3);
		season.setStartingMonth("march");
		return season;
	}

}

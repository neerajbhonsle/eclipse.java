package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.things.Actor;

@ComponentScan
@Configuration("com.xworkz")
public class ActorConfig {
	public ActorConfig() {
		System.out.println("created Actor using config");
	}

	@Bean
	public Actor movie() {
		Actor actor = new Actor("jagghesh", "kannada", 54);
		return actor;
	}

}

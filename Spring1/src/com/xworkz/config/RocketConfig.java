package com.xworkz.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.things.Rocket;

@ComponentScan("com.xworkz")
@Configuration
public class RocketConfig {
	public RocketConfig() {
	System.out.println("created Rocket Configration in Spring");
	}
	@Bean
	public Rocket nasa() {
		System.out.println("registring another rocket in spring");
		Rocket rocket=new Rocket();
		return rocket;
	}

}

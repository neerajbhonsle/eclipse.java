package com.xworkz.autowired.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowired")
public class PillowConfiguration {
	public PillowConfiguration() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public String pilColor() {
		System.out.println(" registring color");
		return "red";
	}

	@Bean
	public char pilSize() {
		System.out.println("registring size");
		return 'M';
	}

	@Bean
	public boolean pilSoft() {
		System.out.println("registring soft");
		return true;
	}
}

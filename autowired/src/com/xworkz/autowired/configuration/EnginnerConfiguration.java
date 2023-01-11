package com.xworkz.autowired.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.autowired")
@Configuration
public class EnginnerConfiguration {
	public EnginnerConfiguration() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public String softName() {
		System.out.println("registring name");
		return "gani";
	}

	@Bean
	public int money() {
		System.out.println("registring salary");
		return 20000;
	}

	@Bean
	public String company() {
		System.out.println("registring companyName");
		return "fb";
	}

	@Bean
	public int years() {
		System.out.println("registring exp");
		return 12;
	}

}

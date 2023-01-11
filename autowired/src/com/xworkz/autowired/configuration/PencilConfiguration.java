package com.xworkz.autowired.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.autowired")
@Configuration
public class PencilConfiguration {
	public PencilConfiguration() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public String pencilName() {
		System.out.println("registring name");
		return "apsara";
	}

	@Bean
	public String pencilType() {
		System.out.println("registring type");
		return "colorPencil";
	}

	@Bean
	public int cost() {
		System.out.println("registring price");
		return 20;
	}

	@Bean
	public String red() {
		System.out.println("registring color");
		return "blue";
	}

	@Bean
	public boolean point() {
		System.out.println("registring sharp");
		return true;
	}

	@Bean
	public boolean steel() {
		System.out.println("registring stolen");
		return true;
	}

}

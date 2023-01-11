package com.xworkz.autowired.configuration;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowired")
public class SoftwareConfiguration {

	public SoftwareConfiguration() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public String naam() {
		System.out.println("registring name");
		return "instagram";
	}

	@Bean
	public double avruthi() {
		System.out.println("registring version");
		return 569.3226;
	}

	@Bean
	public String person() {
		System.out.println("registring dev");
		return "neeraj";
	}

	@Bean
	public LocalDate dinnaka() {
		System.out.println("registring date");
		return LocalDate.now();
	}

	@Bean
	public boolean uchitha() {
		System.out.println("registring free");
		return true;
	}
}

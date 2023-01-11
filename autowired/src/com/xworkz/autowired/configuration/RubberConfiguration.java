package com.xworkz.autowired.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.xworkz.autowired")
@Configuration
public class RubberConfiguration {
	public RubberConfiguration() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	public String rubName() {
		System.out.println("registring rubbername");
		return "nataraj";
	}

	@Bean
	public String rubType() {
		System.out.println("registring rubber type");
		return "rubber";
	}

	@Bean
	public int rubPrice() {
		System.out.println("registring price ");
		return 10;
	}

	@Bean
	public String rubColor() {
		System.out.println("registring color");
		return "white";
	}

	@Bean
	public String rubShape() {
		System.out.println("registring shape");
		return "rectangle";
	}

	@Bean
	public boolean rubStolen() {
		System.out.println("registring stolen");
		return true;
	}

	@Bean
	public char rubSize() {
		System.out.println("registring size");
		return 'M';
	}
}

package com.xworkz.food2.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.food2")
public class Food2Configuration {
	public Food2Configuration() {
		System.out.println("created " + getClass().getSimpleName());
	}
}

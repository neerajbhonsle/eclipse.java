package com.xworkz.Bakery.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Bakery")
public class BakeryConfiguration {
	public BakeryConfiguration() {
		System.out.println("Created:" + getClass().getSimpleName());
	}

}

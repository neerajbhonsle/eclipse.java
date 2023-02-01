package com.xworkz.Compass.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Compass")
public class SpringBeanConfiguration {
	public SpringBeanConfiguration() {
		System.out.println("created " + getClass().getSimpleName());
	}
}

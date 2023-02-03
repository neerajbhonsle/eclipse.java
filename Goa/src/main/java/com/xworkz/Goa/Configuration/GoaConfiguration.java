package com.xworkz.Goa.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Goa")
public class GoaConfiguration {
	public GoaConfiguration() {
		System.out.println("Created " + getClass().getSimpleName());
	}

}

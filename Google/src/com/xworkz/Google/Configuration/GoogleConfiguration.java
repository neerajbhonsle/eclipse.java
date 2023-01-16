package com.xworkz.Google.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Google")
public class GoogleConfiguration {
	public GoogleConfiguration() {
		System.out.println("creating GoogleConfiguration in spring ");
	}

}

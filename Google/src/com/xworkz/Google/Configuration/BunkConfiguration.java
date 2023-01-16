package com.xworkz.Google.Configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan
@Configuration("com.xworkz.Google")
public class BunkConfiguration {
	public BunkConfiguration() {
		System.out.println("creating BunkConfiguration with spring ");
	}

}

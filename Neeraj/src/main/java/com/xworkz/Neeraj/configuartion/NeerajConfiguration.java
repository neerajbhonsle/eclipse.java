package com.xworkz.Neeraj.configuartion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.Neeraj")
public class NeerajConfiguration {
	public NeerajConfiguration() {
		System.out.println("created:" + getClass().getSimpleName());
	}
}

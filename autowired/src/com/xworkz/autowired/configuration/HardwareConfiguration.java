package com.xworkz.autowired.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.autowired")
public class HardwareConfiguration {

	public HardwareConfiguration() {
		System.out.println("created configration");
	}

	@Bean
	public int num() {
		System.out.println("registring id");
		return 89756;
	}

	@Bean
	public String hesaru() {
		System.out.println("registring name");
		return "radhe";
	}

	@Bean
	public double gst() {
		System.out.println("registring gst");
		return 5987516;
	}

	@Bean
	public String onwerHesaru() {
		System.out.println("registring owner");
		return "krishan";
	}

	@Bean
	public String location() {
		System.out.println("registring address");
		return "VR pg gayathrinagar";
	}
}

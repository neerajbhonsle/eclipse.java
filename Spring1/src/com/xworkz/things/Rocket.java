package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
	@Value("India")
	private String country;
	@Value("PSLV")
	private String name;
	@Value("20000")
	private double budget;

	public Rocket() {
		System.out.println("created rocket using const");
	}

	public String getName() {
		return name;
	}

	public String getCountry() {
		return country;
	}

	public double getBudget() {
		return budget;
	}
}

package com.xworkz.Google.Bean;

import org.springframework.stereotype.Component;

import com.xworkz.Google.Service.Fuel;
@Component
public class Petrol implements Fuel {
	public Petrol() {
		System.out.println("creating petrol with no arg const");
	}

	@Override
	public void consume() {
		System.out.println("creating consume using spring ");
	}

}

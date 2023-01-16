package com.xworkz.Google.Bean;

import org.springframework.stereotype.Component;

import com.xworkz.Google.Service.Fuel;
@Component
public class Diesel implements Fuel {
	public Diesel() {
		System.out.println("creating diesel with no arg constr");
	}

	@Override
	public void consume() {
		System.out.println("creating consume using spring");
	}

}

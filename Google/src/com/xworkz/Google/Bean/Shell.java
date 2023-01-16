package com.xworkz.Google.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.Google.Service.Fuel;
import com.xworkz.Google.Service.PetrolBunk;
@Component
public class Shell implements PetrolBunk {
	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;

	public Shell() {
		System.out.println("creating shell with no arg const");
	}

	@Override
	public void purchase() {
		System.out.println("creating purchase using spring");
		fuel.consume();
	}

}

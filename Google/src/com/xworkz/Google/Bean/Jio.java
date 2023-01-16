package com.xworkz.Google.Bean;

import org.springframework.stereotype.Component;

import com.xworkz.Google.Service.Provider;

@Component
public class Jio implements Provider {
	public Jio() {
		System.out.println("creating jio in spring");
	}

	@Override
	public void connect() {
		System.out.println("creating connect in spring");
	}

}

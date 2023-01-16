package com.xworkz.Google.Bean;

import org.springframework.stereotype.Component;

import com.xworkz.Google.Service.Provider;

@Component
public class Airtel implements Provider {
	public Airtel() {
		System.out.println("creating airtel in spring");
	}

	@Override
	public void connect() {
		System.out.println("creating connect in spring");
	}

}

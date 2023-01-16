package com.xworkz.Google.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.Google.Service.Brower;
import com.xworkz.Google.Service.Provider;

@Component
public class Chrome implements Brower {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	@Autowired
	@Qualifier("jio")
	private Provider provider1;

	public Chrome() {
		System.out.println("creating chrome with no arg const");
	}

	@Override
	public void browse() {
		System.out.println("creating brower in spring");
		provider.connect();
		provider1.connect();
	}

}

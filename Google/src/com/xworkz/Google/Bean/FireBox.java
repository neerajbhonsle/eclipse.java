package com.xworkz.Google.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.xworkz.Google.Service.Brower;
import com.xworkz.Google.Service.Provider;

@Component
public class FireBox implements Brower {
	@Autowired
	@Qualifier("airtel")
	private Provider provider;
	@Autowired
	@Qualifier("jio")
	private Provider provider1;

	public FireBox() {
		System.out.println("creating fireBox in spring");
	}

	@Override
	public void browse() {
		System.out.println("creating brower in spring");
		provider.connect();
		provider1.connect();
	}

}

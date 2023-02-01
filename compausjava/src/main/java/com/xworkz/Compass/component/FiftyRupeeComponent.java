package com.xworkz.Compass.component;

import org.springframework.stereotype.Component;

@Component
public class FiftyRupeeComponent {
	public FiftyRupeeComponent() {
		System.out.println("created " + getClass().getSimpleName());
	}
}

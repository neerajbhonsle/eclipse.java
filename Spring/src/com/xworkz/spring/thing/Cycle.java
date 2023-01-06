package com.xworkz.spring.thing;

import org.springframework.stereotype.Component;

@Component
public class Cycle {
	public Cycle() {
		super();
		System.out.println("Running cycle");
	}

}

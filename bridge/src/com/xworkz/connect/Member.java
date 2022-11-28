package com.xworkz.connect;

import com.xworkz.bridge.rules.Family;

public class Member implements Family {

	@Override
	public String respect() {
		System.out.println("must respect elders");
		return null;
	}

	@Override
	public String food() {
		System.out.println("i must eat house food");
		return null;
	}

	@Override
	public String wakeup() {
		System.out.println("i must wake up early morning");
		return null;
	}

	@Override
	public String intime() {
		System.out.println("i must be in time at night");
		return null;
	}

	@Override
	public String drink() {
		System.out.println("i cant drink at home");
		return null;
	}

}

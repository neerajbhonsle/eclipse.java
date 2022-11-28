package com.xworkz.connect;

import com.xworkz.bridge.rules.ArmyRule;

public class Interested implements ArmyRule {
	public String age() {
		System.out.println("age must be b/w 18 to 35");
		return null;
	}

	@Override
	public String countryCitizen() {
		System.out.println("must be citizen of that country");
		return null;
	}

	@Override
	public String education() {
		System.out.println("must complete schooling");
		return null;
	}

	@Override
	public String physical() {
		System.out.println("must be good at physical & mental");
		return null;
	}

	@Override
	public boolean test() {
		System.out.println("must pass the army test");
		return false;
	}
}

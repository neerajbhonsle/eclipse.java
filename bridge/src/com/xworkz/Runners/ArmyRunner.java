package com.xworkz.Runners;

import com.xworkz.bridge.rules.ArmyRule;
import com.xworkz.connect.Interested;

public class ArmyRunner {

	public static void main(String[] args) {
		ArmyRule people = new Interested();
		people.age();
		people.countryCitizen();
		people.education();
		people.physical();
		people.test();
		System.out.println("-----------------------------------");
		Interested people1 = new Interested();
		people1.age();
		people1.countryCitizen();
		people1.education();
		people1.physical();
		people1.test();

	}

}

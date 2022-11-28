package com.xworkz.Runners;

import com.xworkz.bridge.rules.Family;
import com.xworkz.connect.Member;

public class FamilyRunner {

	public static void main(String[] args) {
		Family home = new Member();
		home.respect();
		home.food();
		home.wakeup();
		home.intime();
		home.drink();
		System.out.println("------------------------------------------------");
		Member sweethome = new Member();
		sweethome.respect();
		sweethome.food();
		sweethome.wakeup();
		sweethome.intime();
		sweethome.drink();

	}

}

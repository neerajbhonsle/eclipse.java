package com.xworkz.Runners;

import com.xworkz.bridge.rules.Religion;
import com.xworkz.connect.Hindu;

public class ReligionRunner {

	public static void main(String[] args) {
		Religion person = new Hindu();
		person.honesty();
		person.care();
		person.patience();
		person.selfRestraint();
		person.compassion();
		System.out.println("----------------------------------------------");
		Hindu person1 = new Hindu();
		person1.honesty();
		person1.care();
		person1.patience();
		person1.selfRestraint();
		person1.compassion();

	}

}

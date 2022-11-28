package com.xworkz.Runners;

import com.xworkz.bridge.rules.Pg;
import com.xworkz.connect.Guest;

public class PgRunner {

	public static void main(String[] args) {
		Pg paid = new Guest();
		paid.rent();
		paid.advance();
		paid.noticePeriod();
		paid.food();
		paid.disturb();
		System.out.println("----------------------------------------------------");
		Guest paid1 = new Guest();
		paid1.rent();
		paid1.advance();
		paid1.disturb();
		paid1.food();
		paid1.noticePeriod();
	}

}

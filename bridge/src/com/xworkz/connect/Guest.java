package com.xworkz.connect;

import com.xworkz.bridge.rules.Pg;

public class Guest implements Pg {

	@Override
	public String rent() {
		System.out.println("rent must be paid in time");
		return null;
	}

	@Override
	public String advance() {
		System.out.println("advance amount must pay at the 1st month");
		return null;
	}

	@Override
	public String noticePeriod() {
		System.out.println("notice period is 3month before you check out");
		return null;
	}

	@Override
	public String food() {
		System.out.println("food will be given 3times a day");
		return null;
	}

	@Override
	public String disturb() {
		System.out.println("we cant screm at party");
		return null;
	}

}

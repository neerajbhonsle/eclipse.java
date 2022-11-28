package com.xworkz.connect;

import com.xworkz.bridge.rules.Religion;

public class Hindu implements Religion {

	@Override
	public String honesty() {
		System.out.println("person must be honest");
		return null;
	}

	@Override
	public String care() {
		System.out.println("person must care every living being");
		return null;
	}

	@Override
	public String patience() {
		System.out.println("person must have patience");
		return null;
	}

	@Override
	public String selfRestraint() {
		System.out.println("person must have self control");
		return null;
	}

	@Override
	public String compassion() {
		System.out.println("concern on every suffering things");
		return null;
	}

}

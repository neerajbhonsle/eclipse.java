package com.xworkz.connect;

public class Vijayalakshmi extends JavaTrainee implements KarnatakaRTO {

	public Vijayalakshmi(String firstName, String lastName, int age, String homeTown, long phoneNumber) {
		super(firstName, lastName, age, homeTown, phoneNumber);

	}

	@Override
	public boolean paidTax() {
		System.out.println("already paid the tax");
		return true;
	}

	@Override
	public double gst() {
		System.out.println("paid the tax with gst");
		return 10;
	}

	@Override
	public double vat() {
		System.out.println("running vat");
		return 10;
	}

}

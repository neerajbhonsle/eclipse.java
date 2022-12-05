package com.xworkz.connect;

public abstract class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String homeTown;
	private long phoneNumber;

	public Person(String firstName, String lastName, int age, String homeTown, long phoneNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.homeTown = homeTown;
		this.phoneNumber = phoneNumber;
		System.out.println(this.firstName);
		System.out.println(this.lastName);
		System.out.println(this.age);
		System.out.println(this.homeTown);
		System.out.println(this.phoneNumber);

	}

	public abstract void eat();

	public abstract void sleep();

}
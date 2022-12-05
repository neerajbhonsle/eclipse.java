package com.xworkz.connect;

import com.xworkz.bridge.rules.XworkzRule;

public class JavaTrainee extends Person implements XworkzRule {

	public JavaTrainee(String firstName, String lastName, int age, String homeTown, long phoneNumber) {
		super(firstName, lastName, age, homeTown, phoneNumber);

	}

	@Override
	public boolean uploadedTask() {
		System.out.println("update task daily");
		return true;
	}

	@Override
	public boolean completedProgram() {
		System.out.println("complete the programs daily");
		return false;
	}

	@Override
	public void eat() {
		System.out.println("eat healthy");

	}

	@Override
	public void sleep() {
		System.out.println("minimum 8hrs sleep is must");

	}

	public void training() {
		System.out.println("attend the training daily");
	}

	public void excuteProgram() {
		System.out.println("practice the programs daily");
	}

}

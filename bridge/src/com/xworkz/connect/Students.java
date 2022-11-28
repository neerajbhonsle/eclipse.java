package com.xworkz.connect;

import com.xworkz.bridge.rules.College;

public class Students implements College {

	@Override
	public String id() {
		System.out.println("must wear id card while going to college");
		return null;
	}

	@Override
	public String ragging() {
		System.out.println("ragging is not allowed in college");
		return null;
	}

	@Override
	public String disciplane() {
		System.out.println("we must maintain the basic disciplane in college");
		return null;
	}

	@Override
	public String vehicle() {
		System.out.println("vehicle must be parked in parking area");
		return null;
	}

	@Override
	public String cheat() {
		System.out.println("should not copy during the exams");
		return null;
	}

}

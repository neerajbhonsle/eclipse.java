package com.xworkz.connect;

import com.xworkz.bridge.rules.Cricket;

public class Players implements Cricket {

	@Override
	public String noOfPlayers() {
		System.out.println("In cricket, there are always two teams and 22 players");
		return null;
	}

	@Override
	public String umpire() {
		System.out.println("Ruling of the umpire is final");
		return null;
	}

	@Override
	public String over() {
		System.out.println("Every six balls make an over");
		return null;
	}

	@Override
	public String overThrow() {
		System.out.println("Overthrows could bring extra runs");
		return null;
	}

	@Override
	public String time() {
		System.out.println("Wasting any time on the field is penalized");
		return null;
	}

}

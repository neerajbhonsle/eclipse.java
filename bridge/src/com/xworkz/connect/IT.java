package com.xworkz.connect;

import com.xworkz.bridge.rules.Company;

public class IT implements Company {

	@Override
	public String equality() {
		System.out.println("must be an equal opportunity employer by law");
		return null;
	}

	@Override
	public String attendance() {
		System.out.println("must maintane 80% of attendance");
		return null;
	}

	@Override
	public String disciplinary() {
		System.out.println("must maintane basic disciplane");
		return null;
	}

	@Override
	public String idCard() {
		System.out.println("must wear id card");
		return null;
	}

	@Override
	public String intime() {
		System.out.println("must login in time");
		return null;
	}

}

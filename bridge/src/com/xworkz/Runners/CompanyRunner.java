package com.xworkz.Runners;

import com.xworkz.bridge.rules.Company;
import com.xworkz.connect.IT;

public class CompanyRunner {

	public static void main(String[] args) {
		Company lt = new IT();
		lt.equality();
		lt.attendance();
		lt.disciplinary();
		lt.idCard();
		lt.intime();
		System.out.println("-------------------------------------------------");
		IT dell = new IT();
		dell.equality();
		dell.attendance();
		dell.disciplinary();
		dell.idCard();
		dell.intime();

	}

}

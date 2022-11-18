package com.xworkz.Runners.overridingrunner;

import com.xworkz.child.Childoverriding.Rafell;
import com.xworkz.parent.overriding.Jet;

public class JetRunner {

	public static void main(String[] args) {
		Jet jet=new Rafell();{
			jet.fly();
			System.out.println("$$$$$$");
			jet.war();
			System.out.println("&^*&^%^&*"
					+ "");
		}
	}

}

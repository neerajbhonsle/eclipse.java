package com.xworkz.Runners.overridingrunner;

import com.xworkz.child.Childoverriding.PG;
import com.xworkz.parent.overriding.Jail;

public class JailRunner {

	public static void main(String[] args) {
		Jail jail=new PG(); {
			jail.jailer();
			System.out.println("*********");
			jail.prisoner();
			System.out.println("^^^^^^^^^^^");
		}
	}

}

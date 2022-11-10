package com.xworkz.Runners.overridingrunner;

import com.xworkz.child.Childoverriding.Venkateshwara;
import com.xworkz.parent.overriding.Petrolbunk;

public class BunkRunner {

	public static void main(String[] args) {
		Petrolbunk bunk=new Venkateshwara(); {
			bunk.petrol();
			System.out.println("***********");
			bunk.diesel();
			System.out.println("&&&&&&&&&&&&");
		}
	}

}

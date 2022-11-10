package com.xworkz.child.Childoverriding;

import com.xworkz.parent.overriding.Petrolbunk;

public class Venkateshwara extends Petrolbunk {
	@Override
	public void  petrol() {
		System.out.println("petrol price is 104Rs");
	}
	public void diesel() {
		System.out.println("diesel price is 90Rs");
	}
}

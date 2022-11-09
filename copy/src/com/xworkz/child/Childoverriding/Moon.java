package com.xworkz.child.Childoverriding;

import com.xworkz.parent.overriding.Satellite;

public class Moon extends Satellite {
	public boolean natural;
	public Moon(String name, double area,boolean natural) {
		super(name, area);
		this.natural=natural;
	}
	public void showsolarsystem() {
		super.showsolarsystem();
		System.out.println(this.natural);
	}

}

package com.xworkz.child.Childoverriding;

import com.xworkz.parent.overriding.Director;

public class PuniDirection extends Director{
public int age;
	public PuniDirection(String name, int numberOfMovies,int age) {
		super(name, numberOfMovies);
		this.age=age;
	}
	public void showdirection() {
		super.showdirection();
		System.out.println(this.age);
	}

}

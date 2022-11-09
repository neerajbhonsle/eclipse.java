package com.xworkz.parent.overriding;

public class Satellite {
	public String name;
	public double area;
	public Satellite(String name,double area) {
		super();
		System.out.println("details of satellite");
		this.area=area;
		this.name=name;
		
	}
	public void showsolarsystem() {
		System.out.println(this.name);
		System.out.println(this.area);
	}
}

package com.xworkz.constructor;

public class BoatRunner {

	public static void main(String[] args) {
	Boat boat=new Boat("Imagination");
	System.out.println("name of boat is:"+boat.name);
	boat.name="imagination";
	boat.color="blue";
	System.out.println("boat name is:"+boat.name);
	System.out.println("boat color is :"+boat.color);
	boat.name="imagination";
	boat.color="blue";
	boat.companyName="MSC";
	System.out.println("boat name is:"+boat.name);
	System.out.println("boat color is :"+boat.color);
	System.out.println("boat company is:"+boat.companyName);
	boat.name="imagination";
	boat.color="blue";
	boat.companyName="MSC";
	boat.type="Container Ships";
	System.out.println("boat name is:"+boat.name);
	System.out.println("boat color is :"+boat.color);
	System.out.println("boat company is:"+boat.companyName);
	System.out.println("type of boat:"+boat.type);
	boat.name="imagination";
	boat.color="blue";
	boat.companyName="MSC";
	boat.type="Container Ships";
	boat.owner="neeraj";
	System.out.println("boat name is:"+boat.name);
	System.out.println("boat color is :"+boat.color);
	System.out.println("boat company is:"+boat.companyName);
	System.out.println("type of boat:"+boat.type);
	System.out.println("name of owner is:"+boat.owner);
	

	}

}

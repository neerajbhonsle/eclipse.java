package com.xworkz.parent;

public class Catring {
public String businessName;
public String ownerName;
public double cost;
public Catring() {
	
	System.out.println("details of catring");
}
public Catring(String businessName,String ownerName,double cost) {
	
	this.businessName=businessName;
	this.ownerName=ownerName;
	this.cost=cost;
	
}
public void showcase() {
	System.out.println(this.businessName);
	System.out.println(this.ownerName);
	System.out.println(this.cost);
}

}

package com.xworkz.parent.overriding;

public class Shoppingmall {
public String ownerName;
public double income;
public Shoppingmall(String ownerName,double income)
{

	super();
	System.out.println("details of shoppingmall");
	this.ownerName=ownerName;
	this.income=income;
}
public void showmall() {
	System.out.println(this.ownerName);
	System.out.println(this.income);
}
}

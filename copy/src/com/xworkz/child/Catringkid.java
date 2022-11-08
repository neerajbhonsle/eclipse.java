package com.xworkz.child;

import com.xworkz.parent.Catring;

public class Catringkid extends Catring{
	public Catringkid() {
		System.out.println("details of kid");
	}
	public Catringkid(String businessName,String ownerName,double cost) {
		super(businessName,ownerName,cost);
		
	}
	public void showcase() {
		System.out.println(this.businessName);
		System.out.println(this.ownerName);
		System.out.println(this.cost);
	}

}
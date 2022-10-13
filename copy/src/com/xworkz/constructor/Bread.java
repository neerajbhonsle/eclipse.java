package com.xworkz.constructor;

public class Bread {
	public String shape;
	public float price;
	public String companyName;
	public String type;
	public int quantity;
	
	public Bread () {
		System.out.println("this is about bread details");
	}
	public Bread(String shape) {
		this.shape=shape;
		}
	public Bread(float price) {
		this.price=price;
	}
	public Bread(int quantity) {
		this.quantity=quantity;
	}
	public Bread(String companyName,String type,float price) {
		this.companyName=companyName;
		this.type=type;
		this.price=price;
		
	}
	public Bread(String shape,String type) {
		this.shape=shape;
		this.type=type;
	}
	public Bread(int quantity,float price) {
		this.quantity=quantity;
		this.price=price;
	}
	public Bread(String shape,String companyName,String type) {
		this.shape=shape;
		this.companyName=companyName;
		this.type=type;
	}

}

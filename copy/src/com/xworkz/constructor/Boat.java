package com.xworkz.constructor;

public class Boat {
	public String name;
	public String color;
	public String companyName;
	public String type;
	public String owner;
	
	public Boat () {
	System.out.println("this is about boat details");
}
	public Boat(String name) {
	this.name=name;
	}
	public Boat(String name,String color) {
	this.name=name;
	this.color=color;
	}
	public Boat(String name,String color,String companyName) {
		this.name=name;
		this.color=color;
		this.companyName=companyName;
		}
	public Boat(String name,String color,String companyName,String type) {
		this.name=name;
		this.color=color;
		this.companyName=companyName;
		this.type=type;
		}
	public Boat(String name,String color,String companyName,String type,String owner) {
		this.name=name;
		this.color=color;
		this.companyName=companyName;
		this.type=type;
		this.owner=owner;
		}
	
	}

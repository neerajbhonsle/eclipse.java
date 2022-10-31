package com.xworkz.association;

public class company {
	public String name;
	public String ownerName;
	public address addres ;
	
	
	public company(String name, String ownerName, address addres) {
		super();
		this.name = name;
		this.ownerName = ownerName;
		this.addres = addres;
	}
	public void showofcompany()
	{
	System.out.println(name);	
	System.out.println(ownerName);
     addres.shoeofAdress();
	}
}

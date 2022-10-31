package com.xworkz.association;

public class city {
	public String name;
	public boolean capital;
	public String mla;
	public String famousFor;
	
	public city(String name, boolean capital, String mla, String famousFor) {
		super();
		this.name = name;
		this.capital = capital;
		this.mla = mla;
		this.famousFor = famousFor;
	
	}
	public void showOffCity()
	{
		System.out.println(name);
		System.out.println(capital);
		System.out.println(mla);
		System.out.println(famousFor);
	}
	
}

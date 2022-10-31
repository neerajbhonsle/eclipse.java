package com.xworkz.association;

public class country {
	public String name;
	public String pm;
	public String capital;
	public int states;
	
	public country(String name, String pm, String capital, int states) {
		super();
		this.name = name;
		this.pm = pm;
		this.capital = capital;
		this.states = states;
	}
	public void showOfCountry()
	{
		System.out.println(name);
		System.out.println(pm);
		System.out.println(capital);
		System.out.println(states);
	}
}

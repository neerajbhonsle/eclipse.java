package com.xworkz.association;

public class location {
	public String street;
	public city city;
	public state state;
	public country country;
	
	public location(String street, city city, state state, country country) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
	}
	public void showoflocation()
	{
	System.out.println(street);
	state.showOffStates();
	country.showOfCountry();
	city.showOffCity();

	}
}

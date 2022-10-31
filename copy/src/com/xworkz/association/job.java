package com.xworkz.association;

public class job {
public address address;
	
	public double  salary;
	public String role;
	public boolean bond ;
	public company company;
	
	public job(double salary, String role, boolean bond, company company) {
		super();
		this.salary = salary;
		this.role = role;
		this.bond = bond;
		this.company = company;
	}
	public void showofjob() 
	{
		System.out.println(salary);
		System.out.println(role);
		System.out.println(bond);
	    
		company.showofcompany();
	}


}

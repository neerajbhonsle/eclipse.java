package com.xworkz.association;

public class email {
	public String id;
	public String password;
	public double mobile_no;
	public company company;
	
	public email(String id, String password, double mobile_no, company company) {
		
		this.id = id;
		this.password = password;
		this.mobile_no = mobile_no;
		this.company = company;

		System.out.println(id);
		System.out.println(password);
		System.out.println(mobile_no);
		company.showofcompany();
	}
	
}

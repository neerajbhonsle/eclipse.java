package com.xworkz.association;

public class person {

	public String name;
	public email[] email;
	public job job;
	
	public person(String name, email[] email, job job) {
		super();
		this.name = name;
		this.email = email;
		this.job = job;
	}
	public void showOfPerson() 
	{
		System.out.println(name);
        job.showofjob();
	
         for(int i = 0;i<email.length;i++) {
        	 
        	 email element = this.email[i];
        	 System.out.println(element);
        	
         }
	}
}

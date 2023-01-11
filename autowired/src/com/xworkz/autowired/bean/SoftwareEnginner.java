package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SoftwareEnginner {
	@Autowired
	@Qualifier("softName")
	private String name;
	@Autowired
	@Qualifier("money")
	private int salary;
	@Autowired
	@Qualifier("company")
	private String companyName;
	@Autowired
	@Qualifier("years")
	private int exp;

	public SoftwareEnginner() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "SoftwareEnginner [name=" + name + ", salary=" + salary + ", companyName=" + companyName + ", exp=" + exp
				+ "]";
	}

}

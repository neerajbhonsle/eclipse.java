package com.xworkz.First.bean;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Software {

	@Autowired
	@Qualifier("naam")
	private String name;
	@Autowired
	@Qualifier("avruthi")
	private double version;
	@Autowired
	@Qualifier("person")
	private String developer;
	@Autowired
	@Qualifier("dinnaka")
	private LocalDate date;
	@Autowired
	@Qualifier("uchitha")
	private boolean free;

	public Software() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Software [name=" + name + ", version=" + version + ", developer=" + developer + ", date=" + date
				+ ", free=" + free + "]";
	}
}

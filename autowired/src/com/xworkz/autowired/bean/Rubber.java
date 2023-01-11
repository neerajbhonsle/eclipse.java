package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("rubName")
	private String name;
	@Autowired
	@Qualifier("rubType")
	private String type;
	@Autowired
	@Qualifier("rubPrice")
	private int price;
	@Autowired
	@Qualifier("rubColor")
	private String color;
	@Autowired
	@Qualifier("rubShape")
	private String shape;
	@Autowired
	@Qualifier("rubStolen")
	private boolean stolen;
	@Autowired
	@Qualifier("rubSize")
	private char size;

	public Rubber() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", shape=" + shape
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}

}

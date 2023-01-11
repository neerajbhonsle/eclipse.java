package com.xworkz.autowired.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pillow {
	@Autowired
	@Qualifier("pilColor")
	private String color;
	@Autowired
	@Qualifier("pilSize")
	private char size;
	@Autowired
	@Qualifier("pilSoft")
	private boolean soft;

	public Pillow() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pillow [color=" + color + ", size=" + size + ", soft=" + soft + "]";
	}

}

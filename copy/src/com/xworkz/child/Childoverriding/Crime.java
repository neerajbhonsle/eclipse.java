package com.xworkz.child.Childoverriding;

import com.xworkz.parent.overriding.Criminal;

public class Crime extends Criminal{
	public String type;

	public Crime(String name, int idnumber,String type) {
		super(name, idnumber);
		this.type=type;
	}
	public void showbuddy() {
		super.showbuddy();
		System.out.println(this.type);
	}
	

}

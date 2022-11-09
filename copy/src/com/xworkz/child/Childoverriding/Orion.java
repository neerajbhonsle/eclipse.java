package com.xworkz.child.Childoverriding;

import com.xworkz.parent.overriding.Shoppingmall;

public class Orion extends Shoppingmall {
 public float area;
	public Orion(String ownerName, double income,float area) {
		super(ownerName,income);
		this.area=area;
	
	}
	public void showmall() {
		super.showmall();
		System.out.println(area);
	}
	
}

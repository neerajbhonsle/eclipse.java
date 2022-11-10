package com.xworkz.child.Childoverriding;

import com.xworkz.parent.overriding.HR;

public class Akshara extends HR {
	@Override
	public void hire() 
	{
	System.out.println("hiring form child");
	System.out.println("child is hiring");
	}
	public void fire() 
	{
		System.out.println("firing form child");
		System.out.println("child is firing");
	}
}

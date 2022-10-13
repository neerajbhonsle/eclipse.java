package com.xworkz.constructor;

public class BreadRunner {

	public static void main(String[] args) {
		Bread bread=new Bread("milkbread");
		System.out.println("name of bread is:"+bread.companyName);
		bread.companyName="milkbread";
		System.out.println("name of bread is:"+bread.companyName);
		bread.shape="rectangle";
		System.out.println("shape of bread is :"+bread.shape);
		bread.price=40;
		System.out.println("price of bread:"+bread.price);
		bread.quantity=1;
		System.out.println("quantity of bread: "+bread.quantity);
		bread.type="milkmade";
		System.out.println("type of bread is:"+bread.type);

	}

}

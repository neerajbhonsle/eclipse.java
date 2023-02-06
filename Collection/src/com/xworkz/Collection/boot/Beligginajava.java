package com.xworkz.Collection.boot;
import java.util.ArrayList;
public class Beligginajava {

	public static void main(String[] args) 
	{
		ArrayList a= new ArrayList();
		   a.add(10);
		   a.add("bro");
		   a.add('x');
		   a.add(false);
		   System.out.println(a);

		ArrayList b=new ArrayList();
		b.add(1000);
		b.add("banglore");
		b.add(null);
		System.out.println(b);
		System.out.println(" before merging");
		a.addAll(b);
	    System.out.println("after merging");
	   
	    System.out.println(a);
	    System.out.println(b);
		
		
	}

}

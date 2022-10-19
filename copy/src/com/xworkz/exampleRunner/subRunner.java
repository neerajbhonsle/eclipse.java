package com.xworkz.exampleRunner;
import com.xworkz.example.Sub;
public class subRunner {

	public static void main(String[] args) {

		String[] items1 = {"Maths","Physics","Computer Science","History"};
		String[] items2 = {"theory","problems","Programming"};
		String[] items3 = {"FCD","Pass","Fail"};
		double[] items4 = {34000.0,150000.0,2000000.0};
		long[]   items5 = {13458,794543,1455354};
		String[] items6 = {"India","Russia","USA"};
		
		Sub pass = new Sub("JAVA","Code","USA",1,true,items1,items2,items3,items4,items5,items6);
		
		pass.display();
	}

}

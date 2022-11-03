package com.xworkz.associationRunner;

import com.xworkz.association.Chappal;
import com.xworkz.association.Modifychappal;

public class ChappalRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifychappal modifychappal=new Modifychappal();
		Chappal chappal=new Chappal();
		modifychappal.usechappal(chappal);
		System.out.println(modifychappal.BrandName);
		System.out.println(chappal.getBrandName());
		System.out.println(chappal.getName());
		System.out.println(chappal.getquality());
		System.out.println(chappal.getUsedfor());
		System.out.println(chappal.getprice());
		System.out.println(chappal.getlength());
		System.out.println(chappal.getwidth());
		System.out.println(chappal.getweigthingrams());
		System.out.println(chappal.getcolour());
		

	}

}

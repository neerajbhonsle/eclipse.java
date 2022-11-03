package com.xworkz.association;

public class Modifychappal {
	public String BrandName="sparks";
	public Chappal chappal;
	public void usechappal(Chappal chappal) {
		chappal.setBrandName(null);
		chappal.setName(null);
		chappal.setquality(true);
		chappal.setUsedfor(null);
		chappal.setprice(0);
		chappal.setlength(0);
		chappal.setwidth(0);
		chappal.setweigthingrams(0);
		chappal.setcolour(null);
		
		
		
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

package com.xworkz.association;

public class Modifyplastic {
	public String BrandName="nobrand";
	public Plastic plastic;
	public void useplastic(Plastic plastic) {
		plastic.setBrandName(null);
		plastic.setName(null);
		plastic.setquality(true);
		plastic.setUsedfor(null);
		plastic.setprice(0);
		plastic.setlength(0);
		plastic.setwidth(0);
		plastic.setweigthingrams(0);
		plastic.setcolour(null);
		plastic.setQty(0);
		
		
		System.out.println(plastic.getName());
		System.out.println(plastic.getquality());
		System.out.println(plastic.getUsedfor());
		System.out.println(plastic.getprice());
		System.out.println(plastic.getlength());
		System.out.println(plastic.getwidth());
		System.out.println(plastic.getweigthingrams());
		System.out.println(plastic.getcolour());
		
	}

}

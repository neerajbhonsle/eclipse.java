package com.xworkz.association;

public class Modifysweatshirt {
	public String BrandName="peter england";
	public Sweatshirt sweatshirt;
	public void usesweatshirt(Sweatshirt sweatshirt) {
		sweatshirt.setBrandName(null);
		sweatshirt.setName(null);
		sweatshirt.setquality(true);
		sweatshirt.setUsedfor(null);
		sweatshirt.setprice(0);
		sweatshirt.setlength(0);
		sweatshirt.setwidth(0);
		sweatshirt.setweigthingrams(0);
		sweatshirt.setcolour(null);
		sweatshirt.setQty(0);
		
		
		System.out.println(sweatshirt.getName());
		System.out.println(sweatshirt.getquality());
		System.out.println(sweatshirt.getUsedfor());
		System.out.println(sweatshirt.getprice());
		System.out.println(sweatshirt.getlength());
		System.out.println(sweatshirt.getwidth());
		System.out.println(sweatshirt.getweigthingrams());
		System.out.println(sweatshirt.getcolour());
		
	}

	
}

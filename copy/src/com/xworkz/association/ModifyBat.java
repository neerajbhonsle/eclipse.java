package com.xworkz.association;

public class ModifyBat {
	public String BrandName="MRF";
	public Bat bat;
	public void usebat(Bat bat) {
		bat.setBrandName(null);
		bat.setName(null);
		bat.setquality(true);
		bat.setUsedfor(null);
		bat.setprice(0);
		bat.setlength(0);
		bat.setwidth(0);
		bat.setweigthingrams(0);
		bat.setcolour(null);
		bat.setQty(0);
		
		
		System.out.println(bat.getName());
		System.out.println(bat.getquality());
		System.out.println(bat.getUsedfor());
		System.out.println(bat.getprice());
		System.out.println(bat.getlength());
		System.out.println(bat.getwidth());
		System.out.println(bat.getweigthingrams());
		System.out.println(bat.getcolour());
		
	}
}

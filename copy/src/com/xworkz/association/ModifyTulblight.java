package com.xworkz.association;

public class ModifyTulblight {
	public String BrandName="wipro";
	public Tulblight tulblight;
	public void usetulblight(Tulblight tulblight) {
		tulblight.setName(null);
		tulblight.setBrandName(null);
		tulblight.setquality(true);
		tulblight.setUsedfor(null);
		tulblight.setprice(0);
		tulblight.setlength(0);
		tulblight.setwidth(0);
		tulblight.setweigthingrams(0);
		tulblight.setcolour(null);
		tulblight.setQty(0);
		
		
		System.out.println(tulblight.getName());
		System.out.println(tulblight.getquality());
		System.out.println(tulblight.getUsedfor());
		System.out.println(tulblight.getprice());
		System.out.println(tulblight.getlength());
		System.out.println(tulblight.getwidth());
		System.out.println(tulblight.getweigthingrams());
		System.out.println(tulblight.getcolour());
		
	}
}

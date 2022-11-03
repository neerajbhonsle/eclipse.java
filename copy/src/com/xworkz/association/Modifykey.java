package com.xworkz.association;

public class Modifykey {
	public String BrandName="homiee";
	public Key key;
	public void usekey(Key key) {
		key.setBrandName(null);
		key.setName(null);
		key.setquality(true);
		key.setUsedfor(null);
		key.setprice(0);
		key.setlength(0);
		key.setwidth(0);
		key.setweigthingrams(0);
		key.setcolour(null);
		key.setQty(0);
		
		
		System.out.println(key.getName());
		System.out.println(key.getquality());
		System.out.println(key.getUsedfor());
		System.out.println(key.getprice());
		System.out.println(key.getlength());
		System.out.println(key.getwidth());
		System.out.println(key.getweigthingrams());
		System.out.println(key.getcolour());
		
	}

}

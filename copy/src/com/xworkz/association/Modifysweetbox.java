package com.xworkz.association;

public class Modifysweetbox {
	public String BrandName="amul";
	public Sweetbox sweetbox;
	public void usesweetbox(Sweetbox sweetbox) {
		sweetbox.setBrandName();
		sweetbox.setName();
		sweetbox.setquality();
		sweetbox.setUsedfor();
		sweetbox.setprice();
		sweetbox.setboxlength();
		sweetbox.setboxwidth();
		sweetbox.setweigthingrams();
		sweetbox.setcolour();
		sweetbox.setQty();
		
		
		System.out.println(sweetbox.getName());
		System.out.println(sweetbox.getquality());
		System.out.println(sweetbox.getUsedfor());
		System.out.println(sweetbox.getprice());
		System.out.println(sweetbox.getboxlength());
		System.out.println(sweetbox.getboxwidth());
		System.out.println(sweetbox.getweigthingrams());
		System.out.println(sweetbox.getcolour());
		
	}
}

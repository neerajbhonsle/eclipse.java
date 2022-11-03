package com.xworkz.associationRunner;

import com.xworkz.association.Modifysweetbox;
import com.xworkz.association.Sweetbox;

public class SweetboxRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifysweetbox modifysweetbox=new Modifysweetbox();
		Sweetbox sweetbox=new Sweetbox();
		System.out.println(modifysweetbox.BrandName);
		System.out.println(sweetbox.getBrandName());
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

package com.xworkz.associationRunner;

import com.xworkz.association.Bat;
import com.xworkz.association.ModifyBat;

public class BatRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModifyBat modifyBat=new ModifyBat();
		Bat bat=new Bat();
		System.out.println(modifyBat.BrandName);
		System.out.println(bat.getBrandName());
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

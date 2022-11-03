package com.xworkz.associationRunner;

import com.xworkz.association.Tulblight;
import com.xworkz.association.ModifyTulblight;

public class TulblightRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ModifyTulblight modifyTulblight=new ModifyTulblight();
		Tulblight tulblight=new Tulblight();
		System.out.println(modifyTulblight.BrandName);
		System.out.println(tulblight.getBrandName());
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

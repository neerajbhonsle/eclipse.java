package com.xworkz.associationRunner;

import com.xworkz.association.Key;
import com.xworkz.association.Modifykey;

public class KeyRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifykey modifykey=new Modifykey();
		Key key=new Key();
		System.out.println(modifykey.BrandName);
		System.out.println(key.getBrandName());
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

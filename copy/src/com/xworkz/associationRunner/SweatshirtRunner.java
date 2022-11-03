package com.xworkz.associationRunner;

import com.xworkz.association.Sweatshirt;
import com.xworkz.association.Modifysweatshirt;

public class SweatshirtRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifysweatshirt modifysweatshirt=new Modifysweatshirt();
		Sweatshirt sweatshirt=new Sweatshirt();
		System.out.println(modifysweatshirt.BrandName);
		System.out.println(sweatshirt.getBrandName());
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

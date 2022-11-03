package com.xworkz.associationRunner;

import com.xworkz.association.Modifyplastic;
import com.xworkz.association.Plastic;

public class PlasticRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Modifyplastic modifyplastic=new Modifyplastic();
		Plastic plastic=new Plastic();
		System.out.println(modifyplastic.BrandName);
		System.out.println(plastic.getBrandName());
		System.out.println(plastic.getName());
		System.out.println(plastic.getquality());
		System.out.println(plastic.getUsedfor());
		System.out.println(plastic.getprice());
		System.out.println(plastic.getlength());
		System.out.println(plastic.getwidth());
		System.out.println(plastic.getweigthingrams());
		System.out.println(plastic.getcolour());
	}

}

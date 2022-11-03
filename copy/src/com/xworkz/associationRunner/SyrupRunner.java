package com.xworkz.associationRunner;
import com.xworkz.association.Syrup;
import com.xworkz.association.Syrup2;

public class SyrupRunner {

	public static void main(String[] args) {
		Syrup2 syrup2=new Syrup2();
		Syrup syrup=new Syrup();
		syrup2.usesyrup(syrup);
		System.out.println(syrup2.BrandName);
		System.out.println(syrup.getBrandName());
		System.out.println(syrup.getName());
		System.out.println(syrup.getMfgDate());
		System.out.println(syrup.getUsedfor());
		System.out.println(syrup.getPrice());
		System.out.println(syrup.getExpDate());
		System.out.println(syrup.getHydrobromide());
		System.out.println(syrup.getHydrochloride());
		System.out.println(syrup.getcolour());
		System.out.println(syrup.getMaleate());
	}

}

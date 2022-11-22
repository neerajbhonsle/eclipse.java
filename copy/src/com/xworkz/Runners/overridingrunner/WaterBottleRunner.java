package com.xworkz.Runners.overridingrunner;

import com.xworkz.parent.overriding.WaterBottle;

public class WaterBottleRunner {

	public static void main(String[] args) {
		WaterBottle neeru=new WaterBottle("Bisleri", "Packaged Drinking Water", 100, true, true, 18001211007L,"india", 6, 30, true);
		System.out.println(neeru);
		WaterBottle neeru1=new WaterBottle("Kinley","Packaged Drinking Water", 100, true, true, 18002082653L, "india", 6, 30, true);
		System.out.println(neeru1);
		
		neeru=neeru1;
		boolean pani=neeru.equals(neeru1);
		System.out.println(pani);
	}

}

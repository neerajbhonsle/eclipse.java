package com.xworkz.Runners.overridingrunner;

import com.xworkz.parent.overriding.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
		Vehicle bike =new Vehicle("KTM","Duke125", "white","petrolengine", 120000, true, 125, "Austria", "lakmimotor", "rajajinagar");
		System.out.println(bike);
		Vehicle bike1=new Vehicle("Royalenfield", "classic 350","black" ,"petrolengine", 225000, true, 350, "UK", "jayamotor", "rajajinagar");
		System.out.println(bike1);
		
		bike=bike1;
		boolean gaadi=bike.equals(bike1);
		System.out.println(gaadi);
	}

}

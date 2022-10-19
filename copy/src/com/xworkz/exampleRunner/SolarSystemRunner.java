package com.xworkz.exampleRunner;
import com.xworkz.example.SolarSystem;
public class SolarSystemRunner {

	public static void main(String[] args) {
		String[] items1 = {"Sun","Earth","Jupitor","Neptune"};
		String[] items2 = {"Milky Way Galaxy","Black Eye Galaxy","WhirlPool  Galaxy"};
		String[] items3 = {"Moon","Titan","Phobos","Europa"};
		double[] items4 = {200045435.0,1500656.0,450045546.0};
		long[]   items5 = {1,79,14};
		String[] items6 = {"Mangalyan","Chandrayan","Chandrayan 2"};
		
		SolarSystem saveEarth = new SolarSystem("Earth",'E',"Milky Way Galaxy",3,true,items1,items2,items3,items4,items5,items6);
		
		saveEarth.display();
		
		
		}	
		

	

}

package com.xworkz.exampleRunner;
import com.xworkz.example.Cars;
public class CarsRunner {

	public static void main(String[] args) {
		String[] items1 = {"Mercedes Benz","Rolls Royce","Range Rover","TATA"};
		String[] items2 = {"NewYork","Dubai","India"};
		String[] items3 = {"E Class ","Phantom","Velar","Nexon"};
		double[] items4 = {200045435.0,1500656.0,900000.0};
		long[]   items5 = {13458,7945,1455};
		String[] items6 = {"Daimler AG","Bayerische Motoren werke AG","Ratan Tata"};
		
		Cars nexon = new Cars("TATA",'X',"Nexon",1,true,items1,items2,items3,items4,items5,items6);
		
		nexon.display();

	}

}

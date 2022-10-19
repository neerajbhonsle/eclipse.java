package com.xworkz.exampleRunner;
import com.xworkz.example.TallestBuilding;
public class BuildingRunner {

	public static void main(String[] args) {
		String[] items1 = {"Apartment","House","Bungalow","Condominium"};
		String[] items2 = {"Duplex","Silo","Ranxh-style"};
		String[] items3 = {"Package Builders","General Contractors","Sponser Builders","Ranxh-style"};
		double[] items4 = {34055.0,153340.0,2435000.0};
		long[]   items5 = {13458345,79454345,14553545};
		String[] items6 = {"India","Dubai","USA"};
		
		TallestBuilding Town = new TallestBuilding("Bhurj Khalifa","Tower","Adriana Smith",1,true,items1,items2,items3,items4,items5,items6);
		
		Town.display();

	}

}

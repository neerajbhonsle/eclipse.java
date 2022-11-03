package com.xworkz.associationRunner;
import com.xworkz.association.WashingMachine;
import com.xworkz.association.Modifywashingmachine;
public class WashingRunner {

	public static void main(String[] args) {
		
		
		WashingMachine washingMachine=new WashingMachine();
				System.out.println(washingMachine.getBrand());
				System.out.println(washingMachine.getModelName());
				System.out.println(washingMachine.getFunctionType());
				System.out.println(washingMachine.getWashingCapacity());
				System.out.println(washingMachine.getWashingMethod());
				System.out.println(washingMachine.getHeight());
				System.out.println(washingMachine.getWeight());
				System.out.println(washingMachine.getDepth());
				System.out.println(washingMachine.getWidth());
				System.out.println(washingMachine.getMaxSpinSpeed());
				System.out.println(washingMachine.getPrice());
				System.out.println("==================================");
				Modifywashingmachine modifywashingmachine = new Modifywashingmachine();
				modifywashingmachine.alterWashing(washingMachine);

			}

		

	

}

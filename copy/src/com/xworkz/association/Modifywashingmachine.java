package com.xworkz.association;

public class Modifywashingmachine {
	
		public void alterWashing(WashingMachine washingMachine) {
			washingMachine.setBrand(null);
			washingMachine.setModelName(null);
			washingMachine.setFunctionType(null);
			washingMachine.setWashingCapacity(0);
			washingMachine.setWashingMethod(null);
			washingMachine.setHeight(0);
			washingMachine.setWidth(0);
			washingMachine.setDepth(0);
			washingMachine.setWeight(0);
			washingMachine.setMaxSpinSpeed(0);
			washingMachine.setPrice(0);
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
			
		}

	
}

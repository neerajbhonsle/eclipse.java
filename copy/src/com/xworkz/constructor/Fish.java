package com.xworkz.constructor;

public class Fish {
	public String name;
	public String type;
	public float price;
	public double lengthininches;
	public double weightingrams;
	
	public Fish() {
		
	}
			public Fish(String name) {
				this.name=name;
				System.out.println("this is about fightter fish");
			}
			public Fish(float price) {
				this.price=price;
			}
			public Fish(double lengthininches) {
				this.lengthininches=lengthininches;
				
			}
			public Fish(String type,double weightingrams ) {
				this.type=type;
				this.weightingrams=weightingrams;
				  }
			public Fish(double lengthininches,float price) {
				this.lengthininches=lengthininches;
				this.price=price;
			}
			public Fish(String name,String type) {
				this.name=name;
				this.type=type;
			}
			public Fish(float price,String name) {
				this.name=name;
				this.price=price;
			}

}

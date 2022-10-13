package com.xworkz.constructor;

public class FishRunner {

	public static void main(String[] args) {
		Fish fish=new Fish("fightterfish");
		System.out.println(fish);
		System.out.println("the name of fish is: "+fish.name );
		fish.price=250;
		System.out.println("the price of each fish is: "+fish.price);
		fish.lengthininches=2;
		System.out.println("the length of normal fish is: "+fish.lengthininches);
		fish.type="betta fish";
		System.out.println("the type of fish is: "+fish.type);
		fish.lengthininches=3;
		fish.price=300;
		System.out.println("the length of fish is: "+fish.lengthininches);
		System.out.println("the price of fish "+fish.price);
		fish.name="fighterfish";
		fish.type="halfmoon";
		System.out.println("the name of fish is: "+fish.name);
		System.out.println("the type of fish: "+fish.type);
		fish.name="blue betta";
		fish.price=320;
		System.out.println("the name of fish is:"+fish.name);
		System.out.println("the price of fish:"+fish.price);
	}

}

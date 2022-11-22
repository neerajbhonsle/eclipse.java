package com.xworkz.parent.overriding;

public class GodRunner {

	public static void main(String[] args) {
		God devru=new God("ganesh","shiva & parvati", 1, 2, 2,"rat", 1, "monday", "karthika","mumbai");
		System.out.println(devru);
		God devru1=new God("hanuman", "dono", 1, 2, 1,"none", 1,"saturday","dono","hampi");
		System.out.println(devru1);
		devru=devru1;
		boolean deva=devru.equals(devru1);
		System.out.println(deva);
	}

}

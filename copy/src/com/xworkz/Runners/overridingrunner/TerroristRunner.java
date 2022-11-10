package com.xworkz.Runners.overridingrunner;

import com.xworkz.child.Childoverriding.Kasab;
import com.xworkz.parent.overriding.Terrorist;

public class TerroristRunner {

	public static void main(String[] args) {
		Terrorist terror=new Kasab(); {
			terror.gun();
			System.out.println("@@@@@@@");
			terror.bomb();
			System.out.println("!!!!!!!!!");
		}
		
	}

}

package com.xworkz.Runners;

import com.xworkz.child.High;
import com.xworkz.child.Local;
import com.xworkz.child.Supreme;
import com.xworkz.parent.Court;

public class CourtRUnner {

	public static void main(String[] args) {
		Court court=new Court();
		System.out.println(court.judgename);
		System.out.println(court.location);
		System.out.println("********************************************");
		Supreme supreme=new Supreme();
		System.out.println(supreme.ageofcourt);
		System.out.println(supreme.colour);
		System.out.println("********************************************");
		Court court1=(Supreme)supreme;
		System.out.println(court1.judgename);
		System.out.println(court1.location);
		High high=new High();
		System.out.println(high.ageofjudge);
		System.out.println(high.exp);
		System.out.println("********************************************");
		Court court2=(High)high;
		System.out.println(court2.judgename);
		System.out.println(court2.location);
		System.out.println("********************************************");
		Local local=new Local();
		System.out.println(local.nooflawyers);
		System.out.println(local.noofviwers);
		Court court3=(Local)local;
		System.out.println(court3.judgename);
		System.out.println(court3.location);
		System.out.println("done.!!!!!!");
		

	}

}

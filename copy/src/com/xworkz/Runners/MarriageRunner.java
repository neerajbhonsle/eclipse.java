package com.xworkz.Runners;
import com.xworkz.child.marriagekid;
import com.xworkz.parent.Marriage;
public class MarriageRunner {

	public static void main(String[] args) {
		Marriage madve=new marriagekid("Omkar","meghana","magadi");
		
		System.out.println(madve.brigeName);
		System.out.println(madve.groomName);
		System.out.println(madve.location);

	}

}

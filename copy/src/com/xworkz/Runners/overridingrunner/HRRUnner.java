package com.xworkz.Runners.overridingrunner;

import com.xworkz.child.Childoverriding.Akshara;
import com.xworkz.parent.overriding.HR;

public class HRRUnner {

	public static void main(String[] args) {
		HR hr=new Akshara();
		{
			hr.hire();
			System.out.println("******");
			hr.fire();
			System.out.println("%%%%%%%");
		}
	}

}

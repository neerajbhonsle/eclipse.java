package com.xworkz.Runners.overridingrunner;

import com.xworkz.parent.overriding.Institute;

public class InstitutionRunner {

	public static void main(String[] args) {
		Institute cls=new Institute("xworkz","rajajinagar","omkar" ,"mamatha", 5, 2, "akshara", true,"vinoda", 1);
		System.out.println(cls);
		Institute cls1=new Institute("jspiders","rajajinagar","dono", "dono", 6, 3,"dono", true, "dono", 2);
		System.out.println(cls1);
		
		cls=cls1;
		boolean ww=cls.equals(cls1);
		System.out.println(ww);
	}

}

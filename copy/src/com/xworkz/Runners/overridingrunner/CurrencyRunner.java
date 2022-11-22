package com.xworkz.Runners.overridingrunner;

import com.xworkz.parent.overriding.Currency;

public class CurrencyRunner {

	public static void main(String[] args) {
		Currency money=new Currency("Rupee", "india", 2000, "pink", "gandhiji", 1, 81, true, 2012,"paper");
		System.out.println(money);
		Currency money1=new Currency("dollar", "america", 1000,"grey" ,"dono", 1, 1, true, 2012,"paper");
		System.out.println(money1);
		
		money=money1;
		boolean vv=money.equals(money1);
		System.out.println(vv);
	}

}

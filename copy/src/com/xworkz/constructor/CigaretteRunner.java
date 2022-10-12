package com.xworkz.constructor;

public class CigaretteRunner {

	public static void main(String[] args) {
		Cigarette cigarette = null;
		System.out.println(cigarette);
		cigarette = new Cigarette();
		System.out.println(cigarette.brand);
		System.out.println(cigarette.size);
		System.out.println(cigarette.price);
		System.out.println(cigarette.ShelfLife);
		System.out.println(cigarette.CountryOfOrigin);
		System.out.println(cigarette.PackagingType);
		System.out.println(cigarette.filtertype);
		System.out.println(cigarette.tobaccotype);
		System.out.println(cigarette.Seller);
		System.out.println(cigarette.agelimit);
		System.out.println(cigarette.countryoforigin);
		System.out.println(cigarette.founder);
		System.out.println(cigarette.causes);
		System.out.println(cigarette.yearofselling);
		System.out.println(cigarette.expiry);
	}

}

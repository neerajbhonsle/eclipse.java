package com.xworkz.association;

public class ModifyPerson {
	
	public void modifyingPersonDetails(PersonDetails persondetails) {
		persondetails.setName(null);
		persondetails.setQualification(null);
		persondetails.setNameOfBrother(null);
		persondetails.setNameOfFather(null);
		persondetails.setNameOfMather(null);
		persondetails.setPlace(null);
		persondetails.setAgeOfBrother(0);
		persondetails.setAgeOfFather(0);
		persondetails.setAgeOfMother(0);
		persondetails.setNum(0);
		persondetails.setAddarNum(0);
		
		System.out.println(	persondetails.getName());
		System.out.println(	persondetails.getNameOfBrother());
		System.out.println(	persondetails.getNameOfFather());
		System.out.println(	persondetails.getNameOfMather());
		System.out.println(	persondetails.getAgeOfBrother());
		System.out.println(	persondetails.getAgeOfFather());
		System.out.println(	persondetails.getAgeOfMother());
		System.out.println(	persondetails.getPlace());
		System.out.println(	persondetails.getNum());
		System.out.println(	persondetails.getAddarNum());
		System.out.println(	persondetails.getQualification());
		
	}
	
}

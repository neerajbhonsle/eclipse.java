package com.xworkz.example;

public class GamesNameRunner {

	public static void main(String[] args) {
		String[] items1 = {"AssassinCreed","Watch Dogs","GTA 5","Call Of Duty"};
		String[] items2 = {"Edward","Desmond","Conner"};
		String[] items3 = {"Avinash","Laxmikant","Karthik","Chetan"};
		double[] items4 = {2000.0,1500.0,4500.0};
		long[]   items5 = {5600000l,7500000l,6800000l};
		String[] items6 = {"Docking","Ship Destroying","Eliminating the Leader"};
		
		GamesName play = new GamesName("Crew",'S',"God Of War",70,true,items1,items2,items3,items4,items5,items6);
		
		play.display();
		

	}

}

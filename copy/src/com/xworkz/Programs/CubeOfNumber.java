package com.xworkz.Programs;

import java.util.Scanner;

public class CubeOfNumber {
	private static Scanner sc;
	public static void main(String[] args) {
		int number, cube;
		sc = new Scanner(System.in);
		
		System.out.print(" Please Enter any Number : ");
		number = sc.nextInt();		
		
		cube = number * number * number;
		
		System.out.println("\n The Cube of a Given Number  " + number + "  =  " + cube);
	}

}

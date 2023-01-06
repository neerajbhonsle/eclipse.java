package com.xworkz.example;

import java.util.Scanner;

public class Love {
	public static boolean flowersPetals(int flower1Petals, int flower2Petals) {
		return false;

	}

	public static void main(String[] args) {
		Scanner flower1 = new Scanner(System.in);
        Scanner flower2 = new Scanner(System.in);

        System.out.print("Enter a number of petals: ");
        int num1 = flower1.nextInt();
        int num2 = flower2.nextInt();
        flowersPetals(num1,num2);
        
        if(num1%2==0 && num2%2==0) {
        	System.out.println("They are not in love");
        }else {
        	System.out.println("They are in love");
        }

	}

}

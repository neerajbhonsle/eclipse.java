package com.xworkz.Programs;

import java.util.Scanner;

public class CouponCode {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String coupon = scan.next();
//EH202265D
		int count = 0;
		String str1 = coupon.substring(0, 2);
		// System.out.println(str1);
		String str2 = coupon.substring(2, 6);
		// System.out.println(str2);
		String str3 = coupon.substring(6, 9);
		// System.out.println(str3);

		// int convertString = Integer.parseInt(str2);
		int convertString = Integer.valueOf(str2);
		// System.out.println("convert String to int :" + convertString);

		if (coupon.length() == 9 && convertString >= 2000 && convertString <= 2022) {
			if (str1.charAt(0) >= 'A' && str1.charAt(0) <= 'Z'&& str1.charAt(1) >= 'A' && str1.charAt(1) <= 'Z') {

				
				if (str3.charAt(str3.length() - 1) >= 'A' && str3.charAt(str3.length() - 1) <= 'Z') {
					count++;
				}

			}

		}
		if (count == 0) {
			System.out.println("invalid coupon...");
		} else {
			System.out.println("valid coupon...");
		}
	}
}

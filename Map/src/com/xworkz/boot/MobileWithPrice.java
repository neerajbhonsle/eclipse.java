package com.xworkz.boot;

import java.util.Map;
import java.util.TreeMap;

public class MobileWithPrice {

	public static void main(String[] args) {
		Map<String, Double> ref = new TreeMap<String, Double>((a1, a2) -> a2.compareTo(a1));
		ref.put("iphone", 60000.4);
		ref.put("oneplus", 40000.4);
		ref.put("redmi", 20000.4);
		ref.put("moto", 18000.4);
		ref.put("lenovo", 25000.4);
		ref.put("samsung", 35000.4);
		ref.put("lava", 5000.4);
		ref.put("micromax", 8000.4);
		ref.put("poko", 15000.4);
		ref.put("nokia", 3000.4);
		System.out.println("========entries in uppercase & desc order==========");
		ref.forEach((key, value) -> System.out.println("Mobiles :" + key.toUpperCase() + " price :" + value));
		System.out.println("==========printing if price is greater than 10000========");
		ref.forEach((k, v) -> {
			if (v > 10000) {
				System.out.println("Mobile : " + k + " price: " + v);
			}
		});
		System.out.println("========printing if char is less than 5 character==========");
		ref.forEach((k, v) -> {
			if (k.length() <= 5) {
				System.out.println("mobile : " + k + " price:" + v);
			}
		});
	}

}

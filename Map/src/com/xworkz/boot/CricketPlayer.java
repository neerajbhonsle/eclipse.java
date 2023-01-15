package com.xworkz.boot;

import java.util.Map;
import java.util.TreeMap;

public class CricketPlayer {

	public static void main(String[] args) {
		Map<String, Double> ref = new TreeMap<String, Double>((a1, a2) -> a2.compareTo(a1));
		ref.put("MSD", 17000D);
		ref.put("kohli", 32000D);
		ref.put("rohit", 21000D);
		ref.put("abd", 20000D);
		ref.put("sachin", 36000D);
		System.out.println("=========removing if total run is less than 20000=========");
		ref.forEach((k, v) -> {
			if (v >= 20000) {
				System.out.println("players :" + k + " runs:" + v);
			}
		});

	}

}

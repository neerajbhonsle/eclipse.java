package com.xworkz.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ChocolateRunner {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("Cadbury", 40D);
		map.put("Nestle", 20D);
		map.put("Amul", 55D);
		map.put("Parle", 45D);
		map.put("Mars", 50D);
		map.put("Ferrero Rocher", 100D);
		map.put("Lotus", 80D);
		map.put("Campco", 70D);
		map.put("Hershey", 60D);
		map.put("Pacari", 60D);

		Set<String> key = map.keySet();
		key.forEach(n -> System.out.println(n));
		System.out.println("++++++++++++++++++++++++++");
		Collection<Double> value = map.values();
		value.forEach(r -> System.out.println(r));
		System.out.println("____________________________");
		Set<Entry<String, Double>> entrie = map.entrySet();
		for (Entry<String, Double> entry : entrie) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}

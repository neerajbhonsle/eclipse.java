package com.xworkz.boot;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PgRunner {

	public static void main(String[] args) {
		Map<String, Double> map = new HashMap<String, Double>();
		map.put("VRPg", 6000D);
		map.put("NBPg", 6500D);
		map.put("SHPg", 6400D);
		map.put("GHPg", 6300D);
		map.put("PHPg", 6200D);
		map.put("DIPg", 6500D);
		map.put("JYPg", 5000D);
		map.put("AGPg", 7500D);
		map.put("NVPg", 5000D);
		map.put("PRPg", 6500D);

		Set<String> key = map.keySet();
		key.forEach(e -> System.out.println(e));
		System.out.println("===========================");
		Collection<Double> value = map.values();
		value.forEach(k -> System.out.println(k));
		System.out.println("++++++++++++++++++++++++++++");
		Set<Entry<String, Double>> entries = map.entrySet();
		for (Entry<String, Double> entry : entries) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}

package com.xworkz.boot;

import java.util.Map;
import java.util.TreeMap;

public class CountryWithPresident {
	public static void main(String[] args) {
		Map<String, String> ref = new TreeMap<String, String>();
		ref.put("India", "Droupadi Murmu");
		ref.put("China", " Xi Jinping");
		ref.put("Kazakhstan", " Qasym-Zhomart Toqaev");
		ref.put("Saudi Arabia", "Salman");
		ref.put("Iran", "Hassan Rouhani");
		ref.put("Mongolia", "Khaltmaagiin Battulga");
		ref.put("Indonesia", "Joko Widodo");
		ref.put("Pakistan", "Arif Alvi");
		ref.put("Turkey", "Recep Tayyip Erdogan");
		ref.put("Myanmar", "Myint Swe");
		ref.put("Afghanistan", "Mohammad Hassan Akhund");
		ref.put("Yemen", "Abdrabbuh Mansur Hadi");
		ref.put("Thailand", "Maha Vajiralongkorn");
		ref.put("Turkmenistan", " Gurbanguly Berdimuhamedow");
		ref.put("Iraq", "Barham Salih");
		ref.put("Japan", "Naruhito");
		ref.put("Malaysia", "Yang di-Pertuan Agong");
		ref.put("Oman", "Sultan");
		ref.put("Syria", "Bashar al-Assad");
		ref.put("Bangladesh", "Abdul Hamid");
		System.out.println("==============asc order==========================");
		ref.forEach((key, value) -> System.out.println("country " + key + " president " + value));
		System.out.println("==========upadating president if country length is greater than 10 char============");
		ref.forEach((key, value) -> {
			System.out.println("country " + key + " president " + value);
			if (value.length() > 10) {
				ref.replace("Mongolia", "Khaltmaagiin Battulga");
			}
		});
	}
}

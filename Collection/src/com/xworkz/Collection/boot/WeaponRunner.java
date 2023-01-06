package com.xworkz.Collection.boot;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import com.xworkz.Collection.WeaponType;
import com.xworkz.Collection.DTO.WeaponDTO;

public class WeaponRunner {

	public static void main(String[] args) {

		Collection<WeaponDTO> dto = new ArrayList<WeaponDTO>();
		dto.add(new WeaponDTO("Antiballisticmil", "shash", LocalDate.of(2000, 01, 2), 204D, WeaponType.MISSILES));
		dto.add(new WeaponDTO("ICBM", "arun", LocalDate.of(2001, 02, 2), 205D, WeaponType.MISSILES));
		dto.add(new WeaponDTO("AKM47", "nayana", LocalDate.of(2002, 03, 12), 264D, WeaponType.GUN));
		dto.add(new WeaponDTO("M416", "sirsham", LocalDate.of(2003, 04, 3), 206D, WeaponType.GUN));
		dto.add(new WeaponDTO("M16A4", "gagan", LocalDate.of(2004, 05, 13), 207D, WeaponType.GUN));
		dto.add(new WeaponDTO("SCAR-L", "shash", LocalDate.of(2005, 06, 22), 208D, WeaponType.MISSILES));
		dto.add(new WeaponDTO("AUGA3", "omkar", LocalDate.of(2006, 07, 23), 2010D, WeaponType.MISSILES));
		dto.add(new WeaponDTO("QBZ", "anusha", LocalDate.of(2007, 04, 30), 208D, WeaponType.GUN));
		dto.add(new WeaponDTO("M762", "vinoda", LocalDate.of(2008, 05, 28), 209D, WeaponType.MISSILES));
		dto.add(new WeaponDTO("MK47", "	sudeep", LocalDate.of(2009, 03, 27), 212D, WeaponType.ARTILLERY));
		dto.add(new WeaponDTO("G36C", "darshan", LocalDate.of(2010, 02, 26), 214D, WeaponType.COMBAT_WEAPONS));
		dto.add(new WeaponDTO("KAR98k", "akash", LocalDate.of(2011, 01, 25), 224D, WeaponType.GUN));
		dto.add(new WeaponDTO("M24", "adarsh", LocalDate.of(2012, 04, 24), 244D, WeaponType.ARTILLERY));
		dto.add(new WeaponDTO("AWM", "ganesh", LocalDate.of(2013, 06, 23), 264D, WeaponType.BIOLOGICAL_WEAPONRY));
		dto.add(new WeaponDTO("VSS", "punith", LocalDate.of(2014, 07, 22), 274D, WeaponType.BOMB));
		dto.add(new WeaponDTO("Mini14", "dinesh", LocalDate.of(2016, 10, 21), 294D, WeaponType.COMBAT_WEAPONS));
		dto.add(new WeaponDTO("MK14", "naveen", LocalDate.of(2015, 11, 4), 244D, WeaponType.COMBAT_WEAPONS));
		dto.add(new WeaponDTO("SLR", "jayatha", LocalDate.of(2017, 12, 3), 274D, WeaponType.GUN));
		dto.add(new WeaponDTO("UZI", "prajwal", LocalDate.of(2018, 3, 2), 284D, WeaponType.BIOLOGICAL_WEAPONRY));
		dto.add(new WeaponDTO("Vector", "madhu", LocalDate.of(2019, 4, 3), 284D, WeaponType.MISSILES));
		dto.add(new WeaponDTO("Thompson", "sharath", LocalDate.of(2020, 02, 2), 294D, WeaponType.ARTILLERY));

		System.out.println("Price > 6000 and their names");
		dto.stream().filter((ele) -> ele.getPrice() > 210).collect(Collectors.toList())
				.forEach(e -> System.out.println(e.getName()));

		System.out.println("Print all made by and made on");
		dto.stream()
				.forEach(e -> System.out.println("Weapon made by " + e.getMadeBy() + " and made on " + e.getMadeOn()));

		System.out.println("Print all weapon by desc order");
		dto.stream().sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
				.forEach(e -> System.out.println(e.getName()));

		System.out.println("Print all weapon made_By by asce order");
		dto.stream().sorted((e1, e2) -> e1.getMadeBy().compareTo(e2.getMadeBy()))
				.forEach(e -> System.out.println(e.getMadeBy()));

		System.out.println("Print all weapon made_On by asce order");
		dto.stream().sorted((e1, e2) -> e1.getMadeOn().compareTo(e2.getMadeOn()))
				.forEach(e -> System.out.println(e.getMadeOn()));

		System.out.println("Print all weapon price by asce order");
		dto.stream().sorted((e1, e2) -> e1.getPrice().compareTo(e2.getPrice()))
				.forEach(e -> System.out.println(e.getPrice()));
		System.out.println("Print all weapon price by desc order");
		dto.stream().sorted((e1, e2) -> e2.getPrice().compareTo(e1.getPrice()))
				.forEach(e -> System.out.println(e.getPrice()));

		System.out.println("Print all weapon name and madeOn by asc order");
		dto.stream().sorted((e1, e2) -> e1.getName().compareTo(e2.getName()))
				.sorted((e1, e2) -> e1.getMadeOn().compareTo(e2.getMadeOn())).forEach(
						e -> System.out.println("Sorted name: " + e.getName() + " and sorted madeOn:" + e.getMadeOn()));

		System.out.println("Print all weapon type, madeBy, name in dese order");
		dto.stream().sorted((e1, e2) -> e1.getType().compareTo(e1.getType()))
				.sorted((e1, e2) -> e2.getMadeBy().compareTo(e1.getMadeBy()))
				.sorted((e1, e2) -> e2.getName().compareTo(e1.getName()))
				.forEach(e -> System.out.println("Sorted Type: " + e.getType() + " and sorted madeBy:" + e.getMadeBy()
						+ "and Name is: " + e.getName()));

	}

}

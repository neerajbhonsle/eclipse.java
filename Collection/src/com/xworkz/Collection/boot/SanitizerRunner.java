package com.xworkz.Collection.boot;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.Collection.DTO.SanitizerDTO;

public class SanitizerRunner {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		SanitizerDTO dto = new SanitizerDTO(8523, "dettol", 20, "white");
		SanitizerDTO dto1 = new SanitizerDTO(9874, "savlon", 5, "red");
		SanitizerDTO dto2 = new SanitizerDTO(3579, "sterillium", 10, "green");
		SanitizerDTO dto3 = new SanitizerDTO(6541, "godrej", 10, "yellow");
		SanitizerDTO dto4 = new SanitizerDTO(6598, "lifebuoy", 30, "red");
		Collection<SanitizerDTO> collection = new ArrayList<SanitizerDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);

		Iterator<SanitizerDTO> ref = collection.iterator();
		while (ref.hasNext()) {
			SanitizerDTO element = ref.next();
			if (element.getPrice() < 5) {
				System.out.println("sanitizer price is :" + element);
			}
		}
		Iterator<SanitizerDTO> element1 = collection.iterator();
		while (element1.hasNext()) {
			SanitizerDTO ref1 = element1.next();
			if (ref1.getBrand()==null||ref1.getColor()==null) {
				System.out.println("none of the elements are null " + ref1);
			}
		}
		Iterator<SanitizerDTO> element2 = collection.iterator();
		while (element2.hasNext()) {
			SanitizerDTO ref2 = element2.next();
			if (ref2.getColor().matches("green")) {
				((Iterator<SanitizerDTO>) ref2).remove();
				System.out.println("removed sanitizer with color green " + ref2);
			}
		}
		Iterator<SanitizerDTO> element3 = collection.iterator();
		while (element3.hasNext()) {
			SanitizerDTO ref3 = element3.next();
			if (ref3.getPrice() <= 5) {
				System.out.println("least price of sanitizer is :" + ref3);
			}
		}
		Iterator<SanitizerDTO> element4 = collection.iterator();
		while (element4.hasNext()) {
			SanitizerDTO ref4 = element4.next();
			if (ref4.getPrice() > 20) {
				System.out.println("max price of sanitizer is: " + ref4);
			}
		}
		Iterator<SanitizerDTO> element5 = collection.iterator();
		while (element5.hasNext()) {
			SanitizerDTO ref5 = element5.next();
			if (ref5.getPrice() < 10) {
				System.out.println("2nd max price of sanitizer is: " + ref5);
			}
		}
	}

}

package com.xworkz.Collection.boot;

import java.util.ArrayList;
import java.util.Collection;

import com.xworkz.Collection.DTO.CalendarDTO;

public class CalendarRunner {

	public static void main(String[] args) {
		CalendarDTO dates = new CalendarDTO("table", 95, "paper");
		CalendarDTO dates1 = new CalendarDTO("metal", 145, "paper");
		CalendarDTO dates2 = new CalendarDTO("english", 200, "paper");
		CalendarDTO dates3 = new CalendarDTO("wall", 50, "paper");
		CalendarDTO dates4 = new CalendarDTO("digital", 30, "paper");

		boolean equals = dates.equals(dates4);
		System.out.println(dates.getName().equals(dates4.getName()));
		Collection<CalendarDTO> year = new ArrayList<CalendarDTO>();
		year.add(dates4);
		year.add(dates);
		boolean contains = year.contains(dates4);
		System.out.println(contains);

	}

}

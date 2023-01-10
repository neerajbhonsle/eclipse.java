package com.xworkz.things;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
	private String name;
	private int duration;
	private String startingMonth;

	public Season() {
		// TODO Auto-generated constructor stub
	}

	@Value("rainy")
	public void setName(String name) {
		this.name = name;
	}

	@Value("4")
	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Value("july")
	public void setStartingMonth(String startingMonth) {
		this.startingMonth = startingMonth;
	}

	public String getName() {
		return name;
	}

	public int getDuration() {
		return duration;
	}

	public String getStartingMonth() {
		return startingMonth;
	}
}

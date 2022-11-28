package com.xworkz.Runners;

import com.xworkz.bridge.rules.TrafficRule;
import com.xworkz.connect.Citizens;

public class TrafficRunner {

	public static void main(String[] args) {
		TrafficRule bike = new Citizens();
		bike.wearHelmet();
		bike.tripleRide();
		bike.drank();
		bike.trafficSignals();
		bike.phone();
		System.out.println("----------------------------------------");
		Citizens bike1 = new Citizens();
		bike1.wearHelmet();
		bike1.tripleRide();
		bike1.phone();
		bike1.trafficSignals();
		bike1.drank();
	}

}

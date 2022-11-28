package com.xworkz.connect;

import com.xworkz.bridge.rules.TrafficRule;

public class Citizens implements TrafficRule {
	public String wearHelmet() {
		System.out.println("must wear helmet");
		return null;
	}

	public String tripleRide() {
		System.out.println("triple riding is not allowed");
		return null;
	}

	public boolean drank() {
		System.out.println("dont drink and drive");
		return true;
	}

	public boolean phone() {
		System.out.println("dont use while driving");
		return false;
	}

	public boolean trafficSignals() {
		System.out.println("follow traffic signals");
		return true;
	}

}

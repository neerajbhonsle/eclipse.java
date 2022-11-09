package com.xworkz.Runners.overridingrunner;

import com.xworkz.child.Childoverriding.Moon;
import com.xworkz.parent.overriding.Satellite;

public class SatelliteRUnner {

	public static void main(String[] args) {
		Satellite chanda=new Moon("chandamama", 38000000, true); {
			chanda.showsolarsystem();
		}
	}

}

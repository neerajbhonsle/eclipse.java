package com.xworkz.Runners.overridingrunner;

import com.xworkz.parent.overriding.Paint;

public class PaintRunner {

	public static void main(String[] args) {
		Paint ranga = new Paint("JSW", "RED", 1, 350, "box", true, true, 2022, 2028, true);
		System.out.println(ranga);
		Paint ranga1 = new Paint("Asian", "RED", 1, 400, "box", false, true, 2022, 2028, true);
		System.out.println(ranga1);

		ranga = ranga1;
		boolean wall = ranga.equals(ranga1);
		System.out.println(wall);
	}

}

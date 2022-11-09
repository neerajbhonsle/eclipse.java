package com.xworkz.Runners.overridingrunner;

import com.xworkz.child.Childoverriding.PuniDirection;
import com.xworkz.parent.overriding.Director;

public class DirectorRunner {

	public static void main(String[] args) {
		Director movie=new PuniDirection("punith", 1, 22); {
			movie.showdirection();
		}
	}

}

package com.xworkz.Runners;

import com.xworkz.bridge.rules.College;
import com.xworkz.connect.Students;

public class CollegeRunner {

	public static void main(String[] args) {
		College student = new Students();
		student.id();
		student.ragging();
		student.disciplane();
		student.cheat();
		student.vehicle();
		System.out.println("---------------------------------------------------------");
		Students student1 = new Students();
		student.id();
		student.ragging();
		student.disciplane();
		student.cheat();
		student.vehicle();

	}

}

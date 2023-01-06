package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configurations.Config;
import com.xworkz.spring.thing.Application;
import com.xworkz.spring.thing.Area;
import com.xworkz.spring.thing.Bus;
import com.xworkz.spring.thing.Chocolate;
import com.xworkz.spring.thing.City;
import com.xworkz.spring.thing.Cycle;
import com.xworkz.spring.thing.Fish;
import com.xworkz.spring.thing.Girl;
import com.xworkz.spring.thing.God;
import com.xworkz.spring.thing.Mall;
import com.xworkz.spring.thing.Mask;
import com.xworkz.spring.thing.Milk;
import com.xworkz.spring.thing.Park;
import com.xworkz.spring.thing.Patient;
import com.xworkz.spring.thing.Road;
import com.xworkz.spring.thing.Temple;

public class Runners {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(Config.class);
		Road ref = spring.getBean(Road.class);
		System.out.println(ref);

		Bus ref1 = spring.getBean(Bus.class);
		System.out.println(ref1);

		Cycle ref2 = spring.getBean(Cycle.class);
		System.out.println(ref2);

		City ref3 = spring.getBean(City.class);
		System.out.println(ref3);

		Fish ref4 = spring.getBean(Fish.class);
		System.out.println(ref4);

		Temple ref5 = spring.getBean(Temple.class);
		System.out.println(ref5);

		God ref6 = spring.getBean(God.class);
		System.out.println(ref6);

		Park ref7 = spring.getBean(Park.class);
		System.out.println(ref7);

		Mall ref8 = spring.getBean(Mall.class);
		System.out.println(ref8);

		Application ref9 = spring.getBean(Application.class);
		System.out.println(ref9);

		Area ref10 = spring.getBean(Area.class);
		System.out.println(ref10);

		Chocolate ref11 = spring.getBean(Chocolate.class);
		System.out.println(ref11);

		Mask ref12 = spring.getBean(Mask.class);
		System.out.println(ref12);

		Patient ref13 = spring.getBean(Patient.class);
		System.out.println(ref13);

		Milk ref14 = spring.getBean(Milk.class);
		System.out.println(ref14);

		Girl ref15 = spring.getBean(Girl.class);
		System.out.println(ref15);
	}

}

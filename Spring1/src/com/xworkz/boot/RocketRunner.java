package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.config.RocketConfig;
import com.xworkz.things.Rocket;

public class RocketRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(RocketConfig.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Rocket ref = context.getBean("rocket", Rocket.class);
		System.out.println(ref);
		System.out.println(ref.getCountry());
		System.out.println(ref.getName());
		System.out.println(ref.getBudget());
		Rocket ref1 = context.getBean("nasa", Rocket.class);
		System.out.println(ref1);
		System.out.println(ref1.getCountry());
		System.out.println(ref1.getName());
		System.out.println(ref1.getBudget());

	}

}

package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.config.ActorConfig;
import com.xworkz.things.Actor;

public class ActorRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ActorConfig.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Actor ref = context.getBean("actor", Actor.class);
		System.out.println(ref);
		System.out.println(ref.getName());
		System.out.println(ref.getLang());
		System.out.println(ref.getAge());
		Actor ref1 = context.getBean("movie", Actor.class);
		System.out.println(ref1);
		System.out.println(ref1.getName());
		System.out.println(ref1.getLang());
		System.out.println(ref1.getAge());

	}

}

package com.xworkz.autowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.bean.Pillow;
import com.xworkz.autowired.configuration.PillowConfiguration;

public class PillowRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(PillowConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Pillow pillow = context.getBean(Pillow.class);
		System.out.println(pillow);
	}

}

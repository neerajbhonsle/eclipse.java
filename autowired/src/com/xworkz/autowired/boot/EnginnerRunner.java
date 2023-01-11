package com.xworkz.autowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.bean.SoftwareEnginner;
import com.xworkz.autowired.configuration.EnginnerConfiguration;

public class EnginnerRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(EnginnerConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		SoftwareEnginner engg = context.getBean(SoftwareEnginner.class);
		System.out.println(engg);
	}

}

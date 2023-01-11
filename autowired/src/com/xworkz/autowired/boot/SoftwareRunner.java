package com.xworkz.autowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.bean.Software;
import com.xworkz.autowired.configuration.SoftwareConfiguration;

public class SoftwareRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SoftwareConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		Software shop = context.getBean(Software.class);
		System.out.println(shop);
	}

}

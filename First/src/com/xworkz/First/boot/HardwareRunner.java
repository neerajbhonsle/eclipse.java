package com.xworkz.First.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.First.bean.HardwareShop;
import com.xworkz.First.configuration.HardwareConfiguration;

public class HardwareRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(HardwareConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		HardwareShop shop = context.getBean(HardwareShop.class);
		System.out.println(shop);
	}

}

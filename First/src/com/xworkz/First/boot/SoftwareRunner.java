package com.xworkz.First.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.First.bean.Software;
import com.xworkz.First.configuration.SoftwareConfiguration;

public class SoftwareRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SoftwareConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Software ref = context.getBean(Software.class);
		System.out.println(ref);

	}

}

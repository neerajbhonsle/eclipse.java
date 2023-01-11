package com.xworkz.autowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.bean.Rubber;
import com.xworkz.autowired.configuration.RubberConfiguration;

public class RubberRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(RubberConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Rubber rub = context.getBean(Rubber.class);
		System.out.println(rub);
	}

}

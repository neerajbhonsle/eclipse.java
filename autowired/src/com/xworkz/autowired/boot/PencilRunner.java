package com.xworkz.autowired.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.autowired.bean.Pencil;
import com.xworkz.autowired.configuration.PencilConfiguration;

public class PencilRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(PencilConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));

		Pencil pen = context.getBean(Pencil.class);
		System.out.println(pen);
	}

}

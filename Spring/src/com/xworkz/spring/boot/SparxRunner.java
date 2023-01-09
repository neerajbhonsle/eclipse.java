package com.xworkz.spring.boot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configurations.Sparxconfig;

public class SparxRunner {

	public static void main(String[] args) {
		ApplicationContext spring = new AnnotationConfigApplicationContext(Sparxconfig.class);
		String[] bean = spring.getBeanDefinitionNames();
		System.out.println(Arrays.toString(bean));

		String ref = spring.getBean("brandName", String.class);
		System.out.println(ref.hashCode());

		List<Integer> list = spring.getBean("arrayListValues", ArrayList.class);
		System.out.println(list);

		Map<String, Integer> map = spring.getBean("mapCityAndPincodes", Map.class);
		System.out.println(map);
	}

}

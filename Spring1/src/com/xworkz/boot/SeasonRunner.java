package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.config.SeasonConfig;
import com.xworkz.things.Season;

public class SeasonRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SeasonConfig.class);
		System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));
		Season ref = applicationContext.getBean("season", Season.class);
		System.out.println(ref);
		System.out.println(ref.getName());
		System.out.println(ref.getDuration());
		System.out.println(ref.getStartingMonth());
		Season ref1 = applicationContext.getBean("sunny", Season.class);
		System.out.println(ref1);
		System.out.println(ref1.getName());
		System.out.println(ref1.getDuration());
		System.out.println(ref1.getStartingMonth());
	}

}

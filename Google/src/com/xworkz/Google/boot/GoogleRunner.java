package com.xworkz.Google.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Google.Bean.Chrome;
import com.xworkz.Google.Bean.FireBox;
import com.xworkz.Google.Configuration.GoogleConfiguration;
import com.xworkz.Google.Service.Brower;

public class GoogleRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(GoogleConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		Brower brower = context.getBean(Chrome.class);
		brower.browse();
		System.out.println(brower);
		Brower history = context.getBean(FireBox.class);
		history.browse();
		System.out.println(history);

	}

}

package com.xworkz.Google.Runner;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Google.Bean.Shell;
import com.xworkz.Google.Configuration.BunkConfiguration;
import com.xworkz.Google.Service.PetrolBunk;

public class BunkRunner {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(BunkConfiguration.class);
		System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
		PetrolBunk bunks = context.getBean(Shell.class);
		bunks.purchase();

	}

}

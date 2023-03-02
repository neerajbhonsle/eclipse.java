package com.xworkz.Xworkz.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz.Xworkz")
public class Neeraj_Configuration {
	public Neeraj_Configuration() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@Bean
	public ViewResolver resolver() {
		System.out.println("Running ViewResolver in config");
		return new InternalResourceViewResolver("/", ".jsp");

	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		System.out.println("localContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}

}

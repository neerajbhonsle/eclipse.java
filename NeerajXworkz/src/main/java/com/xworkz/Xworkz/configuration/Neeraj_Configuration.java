package com.xworkz.Xworkz.configuration;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.support.StandardServletMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


import lombok.extern.slf4j.Slf4j;





@Configuration
@ComponentScan("com.xworkz.Xworkz")
@Slf4j
public class Neeraj_Configuration {
	public Neeraj_Configuration() {
		log.info("created:" + getClass().getSimpleName());
		
	}

	@Bean
	public ViewResolver resolver() {
		log.info("Running ViewResolver in config");
		return new InternalResourceViewResolver("/", ".jsp");

	}

	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean() {
		log.info("localContainerEntityManagerFactoryBean");
		return new LocalContainerEntityManagerFactoryBean();
	}

	@Bean
	public MultipartResolver multipartResolver() {
		log.info("multipartResolver");
		return new StandardServletMultipartResolver();
	}

}

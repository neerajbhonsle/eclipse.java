package com.xworkz.Neeraj.configuartion;

import java.util.Arrays;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class NeerajWebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("getServletConfigClasses");
		Class[] configClass= {NeerajConfiguration.class};
		System.out.println("Config class:"+Arrays.toString(configClass));
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("getServletMappings");
		String[] ref = { "/" };
		System.out.println("getServletMappings " + Arrays.toString(ref));
		return ref;
	}
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
	System.out.println("configureDefaultServletHandling");
	configurer.enable();
	}

}

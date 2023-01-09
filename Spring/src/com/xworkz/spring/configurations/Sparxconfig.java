package com.xworkz.spring.configurations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.spring.thing")
public class Sparxconfig {

	@Bean("companyName")
	public String companyName() {
		System.out.println("Registring companyName  with Spring");
		String string = new String();
		return string;
	}

	@Bean("brandName")
	public String brandName() {
		System.out.println("Registring brandName  with Spring");
		String string = new String();
		return string;
	}

	@Bean("ownerFirstName")
	public String ownerFirstName() {
		System.out.println("Registring ownerFirstName  with Spring");
		String string = new String();
		return string;
	}

	@Bean("ownerLastName")
	public String ownerLastName() {
		System.out.println("Registring ownerLastName  with Spring");
		String string = new String();
		return string;
	}

	@Bean("companyCEOName")
	public String companyCEOName() {
		System.out.println("Registring companyCEOName  with Spring");
		String string = new String();
		return string;
	}

	@Bean("companyAlive")
	public Boolean companyAlive() {
		System.out.println("Registering companyAlive with spring");
		Boolean boolean1 = new Boolean(true);
		return true;
	}

	@Bean("companyOwnerAlive")
	public Boolean companyOwnerAlive() {
		System.out.println("Registering companyOwnerAlive with spring");
		Boolean boolean2 = new Boolean(true);
		return true;
	}

	@Bean("companyOwnerMarried")
	public Boolean companyOwnerMarried() {
		System.out.println("Registering companyOwnerMarried with spring");
		Boolean boolean3 = new Boolean(true);
		return true;
	}

	@Bean("companyOnwerHaveKids")
	public Boolean companyOnwerHaveKids() {
		System.out.println("Registering companyOnwerHaveKids with spring");
		Boolean boolean4 = new Boolean(true);
		return true;
	}

	@Bean("companyIsSuccesfull")
	public Boolean companyIsSuccesfull() {
		System.out.println("Registering companyIsSuccesfull with spring");
		Boolean boolean5 = new Boolean(true);
		return true;
	}

	@Bean("companyProducts")
	public Double companyProducts() {
		System.out.println("Registring companyProducts with spring");
		Double double1 = new Double(200);
		return double1;
	}

	@Bean("companyIncome")
	public Double companyIncome() {
		System.out.println("Registring companyIncome with spring");
		Double double1 = new Double(20000);
		return double1;
	}

	@Bean("companyProductsHighestPrice")
	public Double companyProductsHighestPrice() {
		System.out.println("Registring companyProductsHighestPrice with spring");
		Double double1 = new Double(20000);
		return double1;
	}

	@Bean("companyProductsLeastPrice")
	public Double companyProductsLeastPrice() {
		System.out.println("Registring companyProductsLeastPrice with spring");
		Double double1 = new Double(200);
		return double1;
	}

	@Bean("companyTax")
	public Double companyTax() {
		System.out.println("Registring companyTax with spring");
		Double double1 = new Double(20000);
		return double1;
	}

	@Bean("companyName")
	public StringBuffer bufferCompanyName() {
		System.out.println("Registring companyName  with Spring");
		StringBuffer string = new StringBuffer();
		return string;
	}

	@Bean("brandName")
	public StringBuffer bufferBrandName() {
		System.out.println("Registring brandName  with Spring");
		StringBuffer string = new StringBuffer();
		return string;
	}

	@Bean("ownerFirstName")
	public StringBuffer bufferOwnerFirstName() {
		System.out.println("Registring ownerFirstName  with Spring");
		StringBuffer string = new StringBuffer();
		return string;
	}

	@Bean("ownerLastName")
	public StringBuffer bufferOwnerLastName() {
		System.out.println("Registring ownerLastName  with Spring");
		StringBuffer string = new StringBuffer();
		return string;
	}

	@Bean("companyCEOName")
	public StringBuilder bufferCompanyCEOName() {
		System.out.println("Registring companyCEOName  with Spring");
		StringBuilder string = new StringBuilder();
		return string;
	}

	@Bean("companyName")
	public StringBuilder builderCompanyName() {
		System.out.println("Registring companyName  with Spring");
		StringBuilder string = new StringBuilder();
		return string;
	}

	@Bean("brandName")
	public StringBuilder builderBrandName() {
		System.out.println("Registring brandName  with Spring");
		StringBuilder string = new StringBuilder();
		return string;
	}

	@Bean("ownerFirstName")
	public StringBuilder builderOwnerFirstName() {
		System.out.println("Registring ownerFirstName  with Spring");
		StringBuilder string = new StringBuilder();
		return string;
	}

	@Bean("ownerLastName")
	public StringBuilder builderOwnerLastName() {
		System.out.println("Registring ownerLastName  with Spring");
		StringBuilder string = new StringBuilder();
		return string;
	}

	@Bean("companyCEOName")
	public StringBuilder builderCompanyCEOName() {
		System.out.println("Registring companyCEOName  with Spring");
		StringBuilder string = new StringBuilder();
		return string;
	}

	@Bean("arrayListValues")
	public ArrayList arrayList() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		System.out.println(list);
		return (ArrayList) list;
	}

	@Bean("mapCityAndPincodes")
	public Map pincodes() {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Sandur", 583119);
		map.put("bellary", 583265);
		map.put("bangaluru", 583206);
		map.put("Dharwad", 519831);
		map.put("hubli", 587652);
		System.out.println(map);
		return map;
	}

}

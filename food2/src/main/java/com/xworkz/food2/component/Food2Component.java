package com.xworkz.food2.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/game")
public class Food2Component {
	public Food2Component() {
		System.out.println("created " + getClass().getSimpleName());
	}
	
	@PostMapping
	public String send2(@RequestParam String dishName,@RequestParam String dishType,@RequestParam String dishQuantity,@RequestParam String dishPrice) {
		System.out.println("Running send2 in component");
		System.out.println("name:"+dishName);
		System.out.println("name:"+dishType);
		System.out.println("name:"+dishQuantity);
		System.out.println("name:"+dishPrice);
		return "sucess.jsp";
	}
	
}

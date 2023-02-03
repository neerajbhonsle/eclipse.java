package com.xworkz.Goa.Controller;


import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.Goa.dto.GoaDTO;

@Component
@RequestMapping("/play")
public class GoaController {
	public GoaController() {
		System.out.println("Created " + getClass().getSimpleName());
	}
	@PostMapping
	public String going(GoaDTO dto, Model model) {
		System.out.println("Running going method in controller");
		model.addAttribute("name",dto.getName());
		model.addAttribute("curiseName",dto.getCuriseName());
		model.addAttribute("fee",dto.getFee());
		model.addAttribute("freeFood",dto.isFreeFood());
		model.addAttribute("freeAlcohol",dto.isFreeAlcohol());
		System.out.println("dto"+dto);
		return"sucess.jsp";
		
	}

}

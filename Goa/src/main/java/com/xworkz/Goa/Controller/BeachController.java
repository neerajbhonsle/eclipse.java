package com.xworkz.Goa.Controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.Goa.dto.BeachDTO;

@Component
@RequestMapping("/waterGame")
public class BeachController {
	public BeachController() {
		System.out.println("Created :" + getClass().getSimpleName());
	}

	@PostMapping
	public String when(BeachDTO dto, Model model) {
		System.out.println("Running when method in controller");

		model.addAttribute("Beachname", dto.getBeachname());
		model.addAttribute("location", dto.getLocation());
		model.addAttribute("clean", dto.isClean());
		model.addAttribute("game", dto.isGame());
		System.out.println("dto" + dto);
		return "beachsucess.jsp";
	}

}

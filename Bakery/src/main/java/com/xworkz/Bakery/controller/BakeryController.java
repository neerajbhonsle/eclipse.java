package com.xworkz.Bakery.controller;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.Bakery.dto.BakeryDTO;

@Component
@RequestMapping("/kara")
public class BakeryController {
	public BakeryController() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@PostMapping
	public String onBakery(BakeryDTO dto, Model model) {
		System.out.println("Running on Bakery in controller");
		model.addAttribute("name", dto.getName());
		model.addAttribute("ownerName", dto.getOwnerName());
		model.addAttribute("wifeName", dto.getWifeName());
		model.addAttribute("married", dto.isMarried());
		model.addAttribute("famousFor", dto.getFamousFor());
		model.addAttribute("since", dto.getSince());
		return "final.jsp";
	}
}

package com.xworkz.valentine.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.valentine.DTO.ValentineDTO;
import com.xworkz.valentine.service.ValentineService;

@Controller
@RequestMapping("/valentine")
public class ValentineController {

	@Autowired
	private ValentineService valentineService;
	private List<String> places = Arrays.asList("cubbon park", "BTM", "lal bagh", "hebbal", "IndraNagar");
	private List<String> gifts = Arrays.asList("teddy", "chocolates", "iphone", "saree");

	public ValentineController() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@GetMapping
	public String onRose(Model model) {
		System.out.println("Running onRose in controller");
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		return "valentine";
	}

	@PostMapping
	public String onRose(ValentineDTO dto, Model model) {
		System.out.println("Running onValentine post method in controller" + dto);
		Set<ConstraintViolation<ValentineDTO>> violations = valentineService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violations in controller go to success page");
			return "valentineSucess";
		}
		model.addAttribute("places", places);
		model.addAttribute("gifts", gifts);
		model.addAttribute("errors", violations);
		model.addAttribute("dto", dto);
		System.err.println("violations in controller");
		return "valentine";
	}
}

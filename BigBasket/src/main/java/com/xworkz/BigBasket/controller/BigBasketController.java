package com.xworkz.BigBasket.controller;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.BigBasket.DTO.BigBasketDTO;
import com.xworkz.BigBasket.service.BigBasketService;

@Controller
@RequestMapping("/")
public class BigBasketController {
	@Autowired
	private BigBasketService basketService;

	private List<String> food = Arrays.asList("chips", "apple", "biscuit", "chicken", "mutton", "fish", "carb",
			"chocolates");
	private List<String> area = Arrays.asList("rajajinagar", "BTM", "hebbal", "lal bagh", "indraNagar", "cubbon park");

	public BigBasketController() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@GetMapping("/big")
	public String onBigBasket(Model model) {
		System.out.println("Running bigBasket in Controller");
		model.addAttribute("food", food);
		model.addAttribute("area", area);
		return "bigBasket";
	}

	@GetMapping("/search")
	public String onSearch(@RequestParam int id, Model model) {
		System.out.println("Running on search for id" + id);
		BigBasketDTO dto = this.basketService.findById(id);
		if (dto != null) {
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "data not found");
		}
		return "search";
	}

	@PostMapping("/big")
	public String onBigBasket(BigBasketDTO dto, Model model) {
		System.out.println("Running onBigBasket in post in controller ");
		Set<ConstraintViolation<BigBasketDTO>> violations = basketService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violations in controller,go to success page"+dto);
			
			model.addAttribute("name", dto.getName());
			model.addAttribute("phoneNumber", dto.getPhoneNumber());
			model.addAttribute("emailAddress", dto.getEmailAddress());
			model.addAttribute("password", dto.getPassword());
			model.addAttribute("wifeName", dto.getWifeName());
			model.addAttribute("food", dto.getFood());
			model.addAttribute("area", dto.getArea());
			model.addAttribute("price", dto.getPrice());
			model.addAttribute("ownerName", dto.getOwnerName());
			model.addAttribute("ownerWifeName", dto.getOwnerWifeName());
			return "bigBasketSuccess";
		}
		model.addAttribute("food", food);
		model.addAttribute("area", area);
		model.addAttribute("dto", dto);
		model.addAttribute("errors", violations);
		System.err.println("violations in controller");
		return "bigBasket";

	}

}

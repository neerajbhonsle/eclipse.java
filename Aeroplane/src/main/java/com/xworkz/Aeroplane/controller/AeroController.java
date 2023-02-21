package com.xworkz.Aeroplane.controller;

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

import com.xworkz.Aeroplane.DTO.AeroDTO;
import com.xworkz.Aeroplane.service.AeroService;

@Controller
@RequestMapping("/")
public class AeroController {
	@Autowired
	private AeroService aeroService;

	private List<String> type = Arrays.asList("Passenger", "Cargo", "FighterPlane", "PrivateJet", "JamboPlane");
	private List<String> country = Arrays.asList("India", "USA", "Rassia", "Canada", "China");

	public AeroController() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@GetMapping("fly")
	public String onAir(Model model) {
		System.out.println("Running onAir in controller");
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		return "register";

	}

	@PostMapping("fly")
	public String onAir(Model model, AeroDTO dto) {
		System.out.println("Running onAir in post in controller");
		Set<ConstraintViolation<AeroDTO>> violations = this.aeroService.validateAndSave(dto);
		if (violations.isEmpty()) {
			System.out.println("no violations in controller,goto next page");
			model.addAttribute("company", dto.getCompany());
			model.addAttribute("name", dto.getName());
			model.addAttribute("cost", dto.getCost());
			model.addAttribute("type", dto.getType());
			model.addAttribute("country", dto.getCountry());
			return "register";

		}
		model.addAttribute("type", type);
		model.addAttribute("country", country);
		model.addAttribute("errors", violations);
		System.err.println("violations in controller");
		return "register";

	}
	@GetMapping("find")
	public String onSearch(@RequestParam int id,Model model) {
		System.out.println("Running on Search for id"+id);
		AeroDTO dto=this.aeroService.findById(id);
		if(dto!=null) {
			model.addAttribute("dto",dto);
			
		}else {
			model.addAttribute("message", "data not Found");
		}
		return "search";
		
	}
}

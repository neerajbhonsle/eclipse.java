package com.xworkz.Xworkz.controller;

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

import com.xworkz.Xworkz.DTO.NeerajDTO;
import com.xworkz.Xworkz.service.NeerajService;

import lombok.extern.slf4j.Slf4j;

@Controller
@RequestMapping("/")
@Slf4j
public class NeerajController {
	@Autowired
	private NeerajService neerajService; 

	private List<String> type = Arrays.asList("Beer", "whiskey", "Rum", "Brandy","vodka");

	public NeerajController() {
		log.info("created:" + getClass().getSimpleName());
	}

	@GetMapping("drink")
	public String onAlochol(Model model) {
		log.info("Running onAlochol in controller");
		model.addAttribute("type", type);
		return "register";

	}

	@PostMapping("drink")
	public String onAlochol(Model model, NeerajDTO dto) {
		log.info("Running onAlochol in post in controller");
		Set<ConstraintViolation<NeerajDTO>> violations = this.neerajService.validateAndSave(dto);
		if (violations.isEmpty()) {
			log.info("no violations in controller,goto next page");
			model.addAttribute("brand", dto.getBrand());
			model.addAttribute("name", dto.getName());
			model.addAttribute("cost", dto.getCost());
			model.addAttribute("type", dto.getType());
			model.addAttribute("madeIn", dto.getMadeIn());
			return "register";
		}
		model.addAttribute("type", type);
		model.addAttribute("errors", violations);
		System.err.println("violations in controller");
		return "register";
	}

	@GetMapping("find")
	public String onSearch(@RequestParam int id, Model model) {
		log.info("Running on search for id" + id);

		NeerajDTO dto = this.neerajService.findById(id);
		System.out.println(dto);
		if (dto != null) {
			System.out.println(dto);
			model.addAttribute("dto", dto);
		} else {
			model.addAttribute("message", "data not found,please enter valid data");

		}
		return "search";
	}

	@GetMapping("ooti")
	public String onfind(@RequestParam String brand, Model model) {
		log.info("running onfind in controller" + brand);
		List<NeerajDTO> list = this.neerajService.findByBrand(brand);
		if (list != null) {
			model.addAttribute("list", list);
		} else {
			model.addAttribute("message", "Brands not found");
		}
		return "brandSearch";
	}
	@GetMapping("cost")
	public String onfindCost(@RequestParam Double cost, Model model) {
		log.info("running onfind in controller" + cost);
		List<NeerajDTO> list = this.neerajService.validateAndFindByCost(cost);
		if (list != null) {
			model.addAttribute("list", list);
		} else {
			model.addAttribute("message", "Brands not found");
		}
		return "costSearch";
	}

	@GetMapping("update")
	public String onUpdate(@RequestParam int id, Model model) {
		log.info("Running on update" + id);
		NeerajDTO dto = this.neerajService.findById(id);
		model.addAttribute("dto", dto);
		model.addAttribute("type", type);
		return "updateBrand";
	}

	@PostMapping("update")
	public String onUpdate(NeerajDTO dto, Model model) {
		log.info("Running onupdate" + dto);
		Set<ConstraintViolation<NeerajDTO>> constraintViolations = this.neerajService.validateAndUpdate(dto);
		if (constraintViolations.size() > 0) {
			model.addAttribute("errors", constraintViolations);
		} else {
			model.addAttribute("message", "data updated successfully");
		}
		return "updateBrand";
	}

	@GetMapping("delete")
	public String onDelete(@RequestParam int id, Model model) {
		boolean delete = this.neerajService.validateAndDelete(id);
		if (delete = true) {
			model.addAttribute("message", "delete successfully");
			model.addAttribute("id", id);
		} else {
			model.addAttribute("errors", "id not found");
		}
		return "brandSearch";
	}
	
	@GetMapping("getAll")
	public String onAll(Model model) {
		log.info("running onfind in controller");
		List<NeerajDTO> list = this.neerajService.findAll();
		if (list != null) {
			model.addAttribute("list", list);
		} else {
			model.addAttribute("message", "Brands not found");
		}
		return "findAll";
	}
	@GetMapping("findByBrandAndCost")
		public String onFindByBrandAndCost(@RequestParam String brand,@RequestParam  Double cost,Model model) {
			log.info("Running onFindByBrandAndCost in controller");
			if(brand.isEmpty()&& cost!=0) {
				List<NeerajDTO> dtoCost=this.neerajService.validateAndFindByCost(cost);
				System.out.println(dtoCost.size());
				if(dtoCost.size()!=0) {
					model.addAttribute("dtoCost", dtoCost);
					return"brandAndCost";
				}else {
					model.addAttribute("msg1", "data not found");
					return"brandAndCost";
				}
			}else if(!brand.isEmpty()&& cost==0){
				List<NeerajDTO>dtoBrand=this.neerajService.findByBrand(brand);
				if(dtoBrand.size()!=0) {
					model.addAttribute("dtoBrand", dtoBrand);
					return"brandAndCost";
				}else {
					model.addAttribute("msg2","data not found");
					return"brandAndCost";
				}
			}else {
				List<NeerajDTO>dto2=this.neerajService.findByBrandAndCost(brand, cost);
				if(dto2.size()!=0) {
					model.addAttribute("dto", dto2);
					return"brandAndCost";
					
				}else {
					model.addAttribute("msg3","data not found");
					return"brandAndCost";
				}
			}
		}
}
	

package com.xworkz.Neeraj.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.Neeraj.dto.BeverageDTO;
import com.xworkz.Neeraj.dto.ChatsDTO;
import com.xworkz.Neeraj.dto.EducationDTO;
import com.xworkz.Neeraj.dto.MobileDTO;

@Component
@RequestMapping("/")
public class NeerajController {
	public NeerajController() {
		System.out.println("created:" + getClass().getSimpleName());
	}

	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Running onEmail");
		model.addAttribute("mail", "neeraj.xworkz@gmail.com");
		return "index.jsp";
	}

	@GetMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("OnMobile");
		model.addAttribute("number", "8310198147");
		return "index.jsp";

	}

	@GetMapping("/aadhar")
	public String onAadhar(Model model) {
		System.out.println("onAadhar");
		model.addAttribute("adNum", "377780338683");
		return "index.jsp";

	}

	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("onAge");
		model.addAttribute("ages", "23");
		return "index.jsp";

	}

	@GetMapping("/DOB")
	public String onDOB(Model model) {
		System.out.println("onDOB");
		model.addAttribute("birth", LocalDateTime.of(2000, 9, 23, 6, 30));
		return "index.jsp";

	}

	@GetMapping("/salary")
	public String onSalary(Model model) {
		System.out.println("onSalary");
		model.addAttribute("desired", "3.5");
		return "index.jsp";

	}

	@GetMapping("/bff")
	public String onBff(Model model) {
		System.out.println("onBff");
		List<String> ref = new ArrayList<String>();
		ref.add("gani");
		ref.add("puni");
		ref.add("AG");
		ref.add("umer");
		model.addAttribute("bestie", ref);
		return "index.jsp";
	}
	@GetMapping("/visit")
	public String onVisit(Model model) {
		System.out.println("onVisit");
		List<String> ref = new ArrayList<String>();
		ref.add("sandur");
		ref.add("nagawar");
		ref.add("pg");
		ref.add("sandurLake");
		model.addAttribute("place", ref);
		return "index.jsp";
	}
	@GetMapping("/skill")
	public String onSkill(Model model) {
		System.out.println("onSkill");
		List<String> ref = new ArrayList<String>();
		ref.add("java");
		ref.add("html");
		ref.add("css");
		ref.add("sql");
		model.addAttribute("code", ref);
		return "index.jsp";
	}
	@GetMapping("/marks")
	public String onMarks(Model model) {
		System.out.println("onMarks");
		EducationDTO dto=new EducationDTO();
		dto.setName("Neeraj");
		dto.setSchoolName("KNS");
		dto.setSslcMarks(502);
		dto.setHighestScoredSub("socialScience");
		dto.setHighestScoredMarks(97);
		dto.setDiplomaClgName("sanPoly");
		dto.setTotalAvg(73);
		dto.setEnggClgName("pesitm");
		dto.setCgpa(6.4);
		dto.setTotalNumOfBacklogs(10);
		model.addAttribute("cards", dto);
		return"index.jsp";
	}
	@GetMapping("/phone")
	public String onPhone(Model model) {
		System.out.println("onPhone");
		MobileDTO dto=new MobileDTO();
		dto.setBrandName("Redmi");
		dto.setModelName("note8");
		dto.setPrice(12000);
		dto.setWithCharger(true);
		dto.setMtgIn("china");
		model.addAttribute("sim", dto);
		return"index.jsp";
	}
	@GetMapping("/drinks")
	public String onDrinks(Model model) {
		System.out.println("onDrinks");
		BeverageDTO dto=new BeverageDTO();
		dto.setShopName("more");
		dto.setBeverageName("coco-cola");
		dto.setQuantity(100);
		dto.setTasty(true);
		dto.setPrice(30);
		dto.setOnwer("Berkshire Hathaway");
		dto.setBrandAmbassador("Shahrukh Khan");
		dto.setTotalProducts(8);
		model.addAttribute("chilled", dto);
		return"index.jsp";
	}
	@GetMapping("/masale")
	public String onMasale(Model model) {
		System.out.println("onMasale");
		ChatsDTO dto=new ChatsDTO();
		dto.setChatName("masalaPuri");
		dto.setChatShopName("arunChats");
		dto.setPrice(30);
		dto.setTasty(true);
		dto.setQuantity(1);
		dto.setShopLocation("rajajinagar");
		dto.setShopOwnerName("arun");
		dto.setNoOfItems(10);
		dto.setNoOfVarities(1);
		dto.setFlavours("kara");
		dto.setColor("orange");
		model.addAttribute("pani", dto);
		return"index.jsp";
	}
	
}

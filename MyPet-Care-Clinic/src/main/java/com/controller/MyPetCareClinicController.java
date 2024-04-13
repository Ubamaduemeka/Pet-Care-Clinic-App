package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/home")
public class MyPetCareClinicController {
	
	@GetMapping(value="/index")
	public String ClinicPageOpen(Model model) {	
		model.addAttribute("homepage", ' ');
		return "index";		
	}
	
	@GetMapping(value="clinicinfo")
	public String clinicinfoPageOpen(Model model) {	
		model.addAttribute("clinicinfo", ' ');
		return "clinicinfo";		
	}
	
	@GetMapping(value="consultfees")
	public String loginPageOpen(Model model) {	
		model.addAttribute("consultfees", ' ');
		return "consultationfees";		
	}
}

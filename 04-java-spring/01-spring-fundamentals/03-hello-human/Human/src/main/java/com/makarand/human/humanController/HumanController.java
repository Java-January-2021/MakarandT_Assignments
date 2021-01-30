package com.makarand.human.humanController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HumanController {
	@RequestMapping("/")
	public String humanFirstname(@RequestParam(value = "name", required = false, defaultValue = "Human") String name,
			@RequestParam(value = "last_name", required = false) String last_name,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("last_name", last_name);
		System.out.println(name);
		System.out.println(last_name);
		return "HumanName.jsp";
	}

}

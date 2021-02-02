package com.makarand.dojosurvey.dojosurveycontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class dojosurveycontroller {
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String home() {
		return "index.jsp";

	}

	@RequestMapping(path = "/result", method = RequestMethod.POST)
	public String result(@RequestParam(value = "name") String name, @RequestParam(value = "location") String location,
			@RequestParam(value = "language") String language, @RequestParam(value = "comments") String comments,
			Model model) {
		model.addAttribute("name", name);
		model.addAttribute("location", location);
		model.addAttribute("language", language);
		model.addAttribute("comments", comments);
		if (language.equals("Java")) {
			return "redirect:/Java";
		} else {
			return "result.jsp";
		}
	}

	@RequestMapping(path = "/Java", method = RequestMethod.GET)
	public String java() {
		return "java.jsp";

	}
}

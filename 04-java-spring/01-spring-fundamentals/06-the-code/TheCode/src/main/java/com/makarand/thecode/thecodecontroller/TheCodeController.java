package com.makarand.thecode.thecodecontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/")
public class TheCodeController {
	// @RequestMapping(path = "/", method = RequestMethod.GET)
	@RequestMapping("")
	public String home() {
		return "index.jsp";
	}

	@RequestMapping(path = "/trycode", method = RequestMethod.POST)
	public String trycode(@RequestParam(value = "inputcode") String inputcode, RedirectAttributes errors) {
		// System.out.println(inputcode);
		if (inputcode.equals("bushido")) {
			return "redirect:/code";
		} else {
			errors.addFlashAttribute("error", "You should train harder!");
			return "redirect:/";
		}

	}

	@RequestMapping("/code")
	public String code() {
		return "code.jsp";
	}

}

package com.codingdojo.coding.DojoController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	// create another controller named 'Dojo Controller'. For the routes below, use
	// the @PathVariable annotation.
	// Have an http GET request to 'http://localhost:8080/dojo' display a text that
	// says 'The dojo is awesome!'.
	// Have an http GET request to 'http://localhost:8080/dojo/burbank' display a
	// text that says 'Burbank Dojo is located in Southern California'.
	// Have an http GET request to 'http://localhost:8080/dojo/san-jose' display a
	// text that says 'SJ dojo is the headquarters'.
	@RequestMapping("/dojo")
	public String Dojo() {
		return "The dojo is awesome!";
	}

	@RequestMapping("/dojo/{city}")
	public String showCity(@PathVariable("city") String cityName, Model model) {
		switch (cityName) {
		case "burbank":
			return "Burbank Dojo is located in Southern California";
		case "San-Jose":
			return "SJ dojo is the headquarters";
		default:
			return String.format("%s is pretty sweet!", cityName);
		}
		
		
	}
//		model.addAttribute("city", cityName);
//		System.out.println(cityName);
//		return cityName + " Dojo is located in Southern California";
//	}
//	@RequestMapping("/dojo/{city}")
//	public String showCity(@PathVariable("city") String cityName, Model model) {
//		model.addAttribute("city", cityName);
//		System.out.println(cityName);
//		return cityName + " SJ dojo is the headquarters";
//	}

}

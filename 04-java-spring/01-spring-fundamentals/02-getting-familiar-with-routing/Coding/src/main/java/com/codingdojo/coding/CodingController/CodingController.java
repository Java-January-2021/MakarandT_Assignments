package com.codingdojo.coding.CodingController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	@RequestMapping("/coding")
	public String HelloDojo() {
		// System.out.println("Hello Coding Dojo!");
		return "Hello Coding Dojo!";
	}

	@RequestMapping("/coding/python")
	public String Python() {
		// System.out.println("Hello Coding Dojo!");
		return "Python/Django was awesome!";
	}

	@RequestMapping("/coding/java")
	public String Java() {
		// System.out.println("Hello Coding Dojo!");
		return "Java/Spring is better!";
	}

}

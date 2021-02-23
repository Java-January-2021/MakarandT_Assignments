package com.makarand.relationships.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.makarand.relationships.models.License;
import com.makarand.relationships.models.Person;
import com.makarand.relationships.services.LicenseService;
import com.makarand.relationships.services.PersonService;

@Controller
public class HomeController {
	@Autowired
	private PersonService pService;
	@Autowired
	private LicenseService lService;

	@GetMapping("/")
	public String index(Model viewModel) {
		viewModel.addAttribute("person", this.pService.getAllPerson());
		//System.out.println(this.pService.getAllPerson());
		return "index.jsp";
	}

	@GetMapping("/person/{id}")
	public String getPersonById(@PathVariable("id") Long id, Model viewModel) {
		viewModel.addAttribute("person", this.pService.getSinglePerson(id));
		return "ProfilePage.jsp";

	}

	@GetMapping("/person/new")
	public String newPerson(@ModelAttribute("person") Person person) {
		return "NewPerson.jsp";
	}

	@PostMapping("/person/new")
	public String addpeople(@Valid @ModelAttribute("person") Person person, BindingResult result) {
		if (result.hasErrors()) {
			return "NewPerson.jsp";
		} else {
			this.pService.creaetPerson(person);
			return "redirect:/";
		}
	}

	@GetMapping("/license/new")
	public String newLicense(@ModelAttribute("license") License license, Model viewModel) {
		List<Person> allPeople = lService.unLicense(null);
		viewModel.addAttribute("allPeople", allPeople);
		return "NewLicense.jsp";
	}

	@PostMapping("/license/new")
	public String addLicense(@Valid @ModelAttribute("license") License license, BindingResult result,Model viewModel) {
		if (result.hasErrors()) {
			List<Person> allPeople = lService.unLicense(null);
			viewModel.addAttribute("allPeople", allPeople);
			return "NewLicense.jsp";
		} else {
			this.lService.createLicense(license);
			return "redirect:/";
		}

	}
}

package com.makarand.languages.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.makarand.languages.models.LanguageModel;
import com.makarand.languages.services.LanguageService;

@RestController
@RequestMapping("/api")
public class APIController {
	// Dependency injections
	@Autowired
	private LanguageService lService;

	@GetMapping("")
	public List<LanguageModel> index() {
		return this.lService.getAllLanguageModel();
	}

	@GetMapping("/{id}")
	public LanguageModel getLanguageModel(@PathVariable("id") Long id) {
		return this.lService.getSingleLanguageModel(id);
	}

	@PostMapping("")
	public LanguageModel create(LanguageModel newLanguageModel) {
		return this.lService.createLanguageModel(newLanguageModel);
	}

	@DeleteMapping("/{id}")
	public void deleteLanguageModel(@PathVariable("id") Long id) {
		this.lService.deleteLanguageModel(id);

	}

//check this
	@PutMapping
	public LanguageModel putLanguageModel(@PathVariable("id") Long id) {
		return this.lService.updateLanguageModel( getLanguageModel(id));
	}
}

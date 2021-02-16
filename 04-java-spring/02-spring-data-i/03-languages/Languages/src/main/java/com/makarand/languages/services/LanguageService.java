package com.makarand.languages.services;

import java.util.List;

import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makarand.languages.models.LanguageModel;
import com.makarand.languages.repositories.LanguageRepository;

@Service
public class LanguageService {
	// Dependency Injection
	// lan repo name as fist letter followed by repo
	private LanguageRepository lRepo;

	// Constructor
	public LanguageService(LanguageRepository repo) {
		this.lRepo = repo;

	}

	// Get All Languages
	public List<LanguageModel> getAllLanguageModel() {
		return this.lRepo.findAll();
	}

	// Get one language
	public LanguageModel getSingleLanguageModel(Long id) {
		return this.lRepo.findById(id).orElse(null);

	}

	// Create A language
	public LanguageModel createLanguageModel(LanguageModel newLanguageModel) {
		return this.lRepo.save(newLanguageModel);
	}

	// Delete A language

	public void deleteLanguageModel(Long id) {
		this.lRepo.deleteById(id);
	}

	// Update A language

	public LanguageModel updateLanguageModel(LanguageModel newLanguageModel) {
		return this.lRepo.save(newLanguageModel);

	}

	// overload method
	public LanguageModel creaetLanguageModel(String name, String creator, String version) {
		LanguageModel newLanguageModel = new LanguageModel(name, creator, version);
		return this.lRepo.save(newLanguageModel);

	}

}

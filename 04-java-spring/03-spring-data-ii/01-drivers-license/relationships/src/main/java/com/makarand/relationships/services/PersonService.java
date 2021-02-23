package com.makarand.relationships.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makarand.relationships.models.Person;
import com.makarand.relationships.repositories.PersonRepository;

@Service
public class PersonService {
	// Dependency Injection
	@Autowired
	private PersonRepository pRepo;

	// Get all people
	public List<Person> getAllPerson() {
		return this.pRepo.findAll();
	}

	// Get One person by ID
	public Person getSinglePerson(Long Id) {
		return this.pRepo.findById(Id).orElse(null);
	}

	// create person
	public Person creaetPerson(Person newPerson) {
		return this.pRepo.save(newPerson);
	}

	// Delete person
	public void deleteById(Long id) {
		this.pRepo.deleteById(id);
	}
}

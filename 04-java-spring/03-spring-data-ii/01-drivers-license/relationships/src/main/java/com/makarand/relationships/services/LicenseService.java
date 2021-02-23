package com.makarand.relationships.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.makarand.relationships.models.License;
import com.makarand.relationships.models.Person;
import com.makarand.relationships.repositories.LicenseRepository;
import com.makarand.relationships.repositories.PersonRepository;


@Service
public class LicenseService {
	@Autowired
	private LicenseRepository lRepo;

	@Autowired
	private PersonRepository pRepo;
		// Get all License
		public List<License> getAllLicense() {
			return this.lRepo.findAll();
		}
	
		// Get One License by ID
		public License getSingleLicense(Long Id) {
			return this.lRepo.findById(Id).orElse(null);
		}
	
		// create License
		public License createLicense(License newLicense) {
			return this.lRepo.save(newLicense);
		}
		// findby license ifnull 
		public List <Person> unLicense(Long Id){
			return pRepo.findAll();		}
	}


package com.makarand.languages.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.makarand.languages.models.LanguageModel;

@Repository
public interface LanguageRepository extends CrudRepository<LanguageModel, Long> {
	List<LanguageModel> findAll(); // Select * from languages table

	// List <LanguageModel> findById(Long id) ; //Select * from languages table

}

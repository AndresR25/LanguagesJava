package com.codingdojo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.codingdojo.models.Languages;
import com.codingdojo.repositories.LanguageRepository;

@Service
public class LanguageService {
	private final LanguageRepository languageRepository;
	public LanguageService(LanguageRepository languageRepository) {
		this.languageRepository = languageRepository;
	}
	

	public List<Languages> allLanguages(){
		return languageRepository.findAll();
	}
	
	public Languages newLanguage(Languages language) {
		return languageRepository.save(language);
	}
	
	public Languages findLanguage(Long id) {
		Optional<Languages> optionalLanguage = languageRepository.findById(id);
		if(optionalLanguage.isPresent()) {
			return optionalLanguage.get();
		}else {
			return null;
		}
	}
	
	public void deleteLanguage(Long id) {
		Optional<Languages> language = languageRepository.findById(id);
		if(language.isPresent()) {
			languageRepository.deleteById(id);
		}
	}
		
		

}

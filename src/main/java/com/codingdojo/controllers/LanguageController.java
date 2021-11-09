package com.codingdojo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.codingdojo.models.Languages;
import com.codingdojo.services.LanguageService;

@Controller
public class LanguageController {
	
	private final LanguageService languageService;

	public LanguageController(LanguageService languageService) {
		this.languageService = languageService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "redirect:/languages";
	}
	
	@RequestMapping("/languages")
	public String languages(Model model, @ModelAttribute("language") Languages language) {
		List<Languages> languages = languageService.allLanguages();
		model.addAttribute("languages", languages);
		return "index.jsp";
	}
	
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public String create(@Valid @ModelAttribute("language") Languages language, BindingResult result) {
		if (result.hasErrors()) {
			return "index.jsp";
		} else {
			languageService.newLanguage(language);
			return "redirect:/languages";
		}
	}

	@RequestMapping("/languages/{id}")
	public String show(@PathVariable("id") Long id, Model model) {
		Languages language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "show.jsp";
	}

	
	@RequestMapping("/languages/delete/{id}")
	public String delete(@PathVariable("id") Long id) {
		languageService.deleteLanguage(id);
		return "redirect:/languages";
	}

	
	@RequestMapping("/languages/edit/{id}")
	public String edit(@PathVariable("id") Long id, Model model) {
		
		Languages language = languageService.findLanguage(id);
		model.addAttribute("language", language);
		return "edit.jsp";
	}

	@RequestMapping("/update/{id}")
	public String update(@Valid @ModelAttribute("language") Languages language, BindingResult result) {
		languageService.newLanguage(language);
		return "redirect:/languages";
				
	}

}

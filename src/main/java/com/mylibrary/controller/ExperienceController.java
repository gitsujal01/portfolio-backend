package com.mylibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mylibrary.entity.Experience;
import com.mylibrary.services.ExperienceService;

@CrossOrigin(origins = "*")
@RestController
public class ExperienceController {
	
	@Autowired
	private ExperienceService es;

	@GetMapping("/exp")
	public List<Experience> expShow()
	{
		return es.getAllExperience();
	}
	
}

package com.mylibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mylibrary.entity.Skill;
import com.mylibrary.services.SkillService;

@RestController
@CrossOrigin(origins = "*")
public class SkillController {

	@Autowired
	private SkillService skillser;
	@GetMapping("/skills")
	public List<Skill> showSkill()
	{
		return skillser.getAllSkill(); 
	}
}

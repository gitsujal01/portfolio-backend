package com.mylibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mylibrary.entity.Project;
import com.mylibrary.services.ProjectService;

@CrossOrigin(origins = "*")
@RestController
public class ProjectController {

	@Autowired
	private ProjectService ps;
	@GetMapping("/projects")
	public List<Project> getAllProject()
	{
		return ps.getAllprojects();
	}

}

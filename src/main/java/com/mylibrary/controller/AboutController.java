package com.mylibrary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mylibrary.entity.About;
import com.mylibrary.services.AboutService;

@CrossOrigin(origins = "*")
@RestController
public class AboutController {

	@Autowired
	private AboutService as;
	@GetMapping("/about")
	public List<About> showAbout()
	{
		return as.getAllbout();
	}
}

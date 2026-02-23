package com.mylibrary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylibrary.entity.Experience;
import com.mylibrary.repository.ExperienceRepository;

@Service
public class ExperienceServiceImpl implements ExperienceService{

	@Autowired
	private ExperienceRepository er;
	@Override
	public List<Experience> getAllExperience() {
		// TODO Auto-generated method stub
		return er.findAll();
	}
	

}

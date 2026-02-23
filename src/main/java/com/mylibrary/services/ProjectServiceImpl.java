package com.mylibrary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylibrary.entity.Project;
import com.mylibrary.repository.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService{

	@Autowired
	private ProjectRepository pr;
	@Override
	public List<Project> getAllprojects() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

}

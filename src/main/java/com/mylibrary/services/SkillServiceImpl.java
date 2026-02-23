package com.mylibrary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mylibrary.entity.Skill;
import com.mylibrary.repository.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService
{

	@Autowired
	private SkillRepository ss;
	@Override
	public List<Skill> getAllSkill() {
		// TODO Auto-generated method stub
		return ss.findAll();
	}

}

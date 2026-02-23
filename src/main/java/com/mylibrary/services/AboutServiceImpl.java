package com.mylibrary.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mylibrary.entity.About;
import com.mylibrary.repository.AboutRepo;

@Service
public class AboutServiceImpl implements AboutService{

	@Autowired
	private AboutRepo ar;
	@Override
	public List<About> getAllbout() {
		// TODO Auto-generated method stub
		return ar.findAll();
	}

}

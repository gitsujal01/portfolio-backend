package com.mylibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mylibrary.entity.Project;

public interface ProjectRepository extends JpaRepository<Project, Long>{

}

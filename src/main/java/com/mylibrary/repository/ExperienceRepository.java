package com.mylibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mylibrary.entity.Experience;

public interface ExperienceRepository extends JpaRepository<Experience, Long>
{

}

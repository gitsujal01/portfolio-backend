package com.mylibrary.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mylibrary.entity.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long>{

}

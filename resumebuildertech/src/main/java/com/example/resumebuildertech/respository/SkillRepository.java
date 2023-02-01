package com.example.resumebuildertech.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resumebuildertech.entity.Skills;

@Repository
public interface SkillRepository extends JpaRepository<Skills,Integer>{

}

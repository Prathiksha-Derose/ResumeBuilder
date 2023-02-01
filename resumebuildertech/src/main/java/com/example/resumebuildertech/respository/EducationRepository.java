package com.example.resumebuildertech.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resumebuildertech.entity.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education,Integer>{

}

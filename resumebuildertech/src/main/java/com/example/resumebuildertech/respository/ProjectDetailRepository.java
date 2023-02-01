package com.example.resumebuildertech.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resumebuildertech.entity.ProjectDetail;

@Repository
public interface ProjectDetailRepository extends JpaRepository<ProjectDetail,Integer>{

}
package com.example.resumebuildertech.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resumebuildertech.entity.Summary;
@Repository
public interface SummaryRepository extends JpaRepository<Summary, Integer>{

}

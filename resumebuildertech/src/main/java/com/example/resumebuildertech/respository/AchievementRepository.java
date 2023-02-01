package com.example.resumebuildertech.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resumebuildertech.entity.Achievement;
@Repository
public interface AchievementRepository extends JpaRepository<Achievement, Integer>{

}

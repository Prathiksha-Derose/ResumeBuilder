package com.example.resumebuildertech.respository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.resumebuildertech.entity.Profile;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer>{

	List<Profile> findByEmployeeId(String employeeId);
	Optional<Profile> findByEmployeeIdAndResumeDetails(String employeeId,String resumeDetails);
}

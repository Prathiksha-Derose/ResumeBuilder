package com.example.resumebuildertech.service;

import java.util.List;

import com.example.resumebuildertech.dto.ProfileDto;

public interface ResumeBuilderService {

	ProfileDto register(ProfileDto resumeBuilderDto);

	List<ProfileDto> getAll();

	List<ProfileDto> getByEmployeeId(String employeeId);

	ProfileDto getByEmployeeIdAndResume(String employeeId, String resumeDetails);

}
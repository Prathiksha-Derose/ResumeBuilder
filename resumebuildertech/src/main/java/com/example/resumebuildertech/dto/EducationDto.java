package com.example.resumebuildertech.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EducationDto {

	private String highestEducation;
	private String specialzation;
	private String university;
	private String passoutYear;
	private String percentage;
}

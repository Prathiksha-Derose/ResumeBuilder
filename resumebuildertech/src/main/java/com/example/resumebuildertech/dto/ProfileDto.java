package com.example.resumebuildertech.dto;
import java.util.List;
import com.example.resumebuildertech.entity.Achievement;
import com.example.resumebuildertech.entity.Education;
import com.example.resumebuildertech.entity.ProjectDetail;
import com.example.resumebuildertech.entity.Skills;
import com.example.resumebuildertech.entity.Summary;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProfileDto {

	private String firstName;
	private String lastName;
	private String totalExperience;
	private String revlevantExperience;
	private String employeeId;
    private String resumeDetails;
	
	
	private List<Education> educations;
	
	private Skills skills;
	
	private List<ProjectDetail> projectDetail;
	
	private  Achievement achievement;
	
	private List<Summary>summary;
	
	
	
}

package com.example.resumebuildertech.dto;

import java.util.List;


import javax.persistence.Convert;

import com.example.resumebuildertech.controller.StringListConverter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SkillsDto {

	@Convert(converter=StringListConverter.class)
	private List<String> frontendTechnologiesSkills;
	@Convert(converter=StringListConverter.class)
	private List<String> backendTechnologies;
	@Convert(converter=StringListConverter.class)
	private List<String> midwareTechnologies;
	@Convert(converter=StringListConverter.class)
	private List<String> designPatternSkills;
	@Convert(converter=StringListConverter.class)
	private List<String> databaseUsed;
	@Convert(converter=StringListConverter.class)
	private List<String> versionControlSystem;
	@Convert(converter=StringListConverter.class)
	private List<String> aws;
	@Convert(converter=StringListConverter.class)
	private List<String> sdlc;
}

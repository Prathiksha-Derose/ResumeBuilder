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
public class ProjectDetailDto {

	@Convert(converter=StringListConverter.class)
	private List<String> frontendTechnologie;
	@Convert(converter=StringListConverter.class)
	private List<String> designPattern;
	@Convert(converter=StringListConverter.class)
	private List<String> databasess;
	@Convert(converter=StringListConverter.class)
	private List<String> developmentTools;
	private String duration;
	private String teamSize;
	private String projectDescription;
	private String rolesResponsibility;
}

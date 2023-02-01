package com.example.resumebuildertech.entity;
import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.resumebuildertech.controller.StringListConverter;
import javax.persistence.Convert;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class ProjectDetail  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1698135314912596582L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Convert(converter=StringListConverter.class)
	private List<String> frontendTechnologie;
	@Convert(converter=StringListConverter.class)
	private List<String> backendTechnologie;
	@Convert(converter=StringListConverter.class)
	private List<String> midwareTechnologie;
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
  

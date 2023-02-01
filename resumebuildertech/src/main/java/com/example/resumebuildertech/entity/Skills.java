package com.example.resumebuildertech.entity;
import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.example.resumebuildertech.controller.StringListConverter;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.CascadeType;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Skills  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 731932195986051364L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer skillsId;
	@Convert(converter=StringListConverter.class)
	private List<String> frontendTechnologiesSkills;
	@Convert(converter=StringListConverter.class)
	private List<String> backendTechnologies;
	@Convert(converter=StringListConverter.class)
	private List<String> midwareTechnologies;
	@Convert(converter=StringListConverter.class)
	private List<String> designPatternSkills;
	@Convert(converter=StringListConverter.class)
	private List<String> versionControlSystem;
	@Convert(converter=StringListConverter.class)
	private List<String> aws;
	@Convert(converter=StringListConverter.class)
	private List<String> sdlc;

	

	
	
}

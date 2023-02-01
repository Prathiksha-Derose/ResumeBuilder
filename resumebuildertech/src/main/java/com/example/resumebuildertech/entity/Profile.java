package com.example.resumebuildertech.entity;
import java.io.Serializable;
import java.util.List;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
//@Builder
public class Profile implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6678550988309326368L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer profileId;
	private String firstName;
	private String lastName;
	private String totalExperience;
	private String revlevantExperience;
	private String employeeId;
	private String resumeDetails;
	
    //unidirectional
	@OneToMany(cascade = CascadeType.ALL)
	private List<Summary>summary;
	
    //unidirectional
	@OneToOne(cascade = CascadeType.ALL)
	private  Achievement achievement;
	
    //unidirectional
	@OneToOne(cascade = CascadeType.ALL)
//	@JsonManagedReference
	private Skills skills;
	
    //unidirectional
	@OneToMany(cascade = CascadeType.ALL)
//	@JsonManagedReference
     private List<Education> educations;
	
	//unidirectional
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "projectDetails_id")
    private List<ProjectDetail> details;


}
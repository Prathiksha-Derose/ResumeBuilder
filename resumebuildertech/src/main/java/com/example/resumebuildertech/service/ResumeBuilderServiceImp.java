package com.example.resumebuildertech.service;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.resumebuildertech.dto.ProfileDto;

import com.example.resumebuildertech.entity.Profile;

import com.example.resumebuildertech.exception.InvalidException;
import com.example.resumebuildertech.exception.ResumeBuilderException;

import com.example.resumebuildertech.respository.ProfileRepository;

@Service
public class ResumeBuilderServiceImp implements ResumeBuilderService {

	@Autowired
	private ProfileRepository resumeRepository;

	private static final String ERRORMESSAGE = "something went wrong";

	public ProfileDto register(ProfileDto resumeBuilderDto) {
//		try {
//			List<Profile> employeeId = resumeRepository.findByEmployeeId(resumeBuilderDto.getEmployeeId());
			Profile profile = new Profile();
			BeanUtils.copyProperties(resumeBuilderDto, profile);

			profile.setDetails(resumeBuilderDto.getProjectDetail());
		    profile.setEducations(resumeBuilderDto.getEducations());
			profile.setSkills(resumeBuilderDto.getSkills());
			profile.setAchievement(resumeBuilderDto.getAchievement());
			profile.setSummary(resumeBuilderDto.getSummary());
			resumeRepository.save(profile);
			return resumeBuilderDto;
		}
//		} catch (EmployeeNotFoundException e) {
//			throw e;
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new ResumeBuilderException(ERRORMESSAGE);
//		}

//	}

	public List<ProfileDto> getAll() {
		try {
			List<Profile> list = resumeRepository.findAll();
			List<ProfileDto> profileDtos = new ArrayList<>();
			if (!list.isEmpty()) {
				list.forEach(profile -> {
					ProfileDto dto = new ProfileDto();
					BeanUtils.copyProperties(profile, dto);
				    dto.setEducations(profile.getEducations());
					dto.setSkills(profile.getSkills());
					dto.setProjectDetail(profile.getDetails());
//					dto.setAchievement(profile.getAchievement());
					dto.setSummary(profile.getSummary());
					profileDtos.add(dto);
				});
				return profileDtos;
			} else {
				throw new EmployeeNotFoundException(" The list is null ");
			}
		} catch (EmployeeNotFoundException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw new ResumeBuilderException(ERRORMESSAGE);
		}
	}

	public List<ProfileDto> getByEmployeeId(String employeeId) {
		try {
			List<Profile> list = resumeRepository.findByEmployeeId(employeeId);
			List<ProfileDto> profileDtos = new ArrayList<>();
			if (!list.isEmpty()) {
				list.forEach(profile -> {
					ProfileDto dto = new ProfileDto();
					BeanUtils.copyProperties(profile, dto);
					dto.setEducations(profile.getEducations());
					dto.setSkills(profile.getSkills());
					dto.setProjectDetail(profile.getDetails());
					dto.setAchievement(profile.getAchievement());
					dto.setSummary(profile.getSummary());
					profileDtos.add(dto);
				});
				return profileDtos;
			} else {
				throw new EmployeeNotFoundException("The EmployeeId is Null");
			}
		} catch (EmployeeNotFoundException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw new ResumeBuilderException(ERRORMESSAGE);
		}
	}

	public ProfileDto getByEmployeeIdAndResume(String employeeId, String resumeDetails) {
		try {
			Optional<Profile> details = resumeRepository.findByEmployeeIdAndResumeDetails(employeeId, resumeDetails);

			if (details.isPresent()) {
				Profile profile = details.get();
				ProfileDto dto = new ProfileDto();
				BeanUtils.copyProperties(profile, dto);
			    dto.setEducations(profile.getEducations());
				dto.setSkills(profile.getSkills());
				dto.setProjectDetail(profile.getDetails());
			dto.setAchievement(profile.getAchievement());
				dto.setSummary(profile.getSummary());
                return dto;
			} else {
				throw new InvalidException("The Employee is Not Present");
			}
		} catch (EmployeeNotFoundException e) {
			throw e;
		} catch (Exception e) {
			e.printStackTrace();
			throw new ResumeBuilderException(ERRORMESSAGE);
		}

	}

}


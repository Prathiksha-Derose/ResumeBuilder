package com.example.resumebuildertech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.resumebuildertech.dto.ProfileDto;

import com.example.resumebuildertech.exception.InvalidException;
import com.example.resumebuildertech.response.Response;
import com.example.resumebuildertech.service.ResumeBuilderService;

import lombok.RequiredArgsConstructor;

@RestController
public class ResumeBuilderController {

	@Autowired
	private  ResumeBuilderService resumeBuilderService;
	@Autowired
	private  Response response;
	
	@PostMapping("/save")
	public ResponseEntity<Response> registerResume(@RequestBody ProfileDto resumeBuilderDto){
		ProfileDto builder=resumeBuilderService.register(resumeBuilderDto);
		if (builder!=null) {
			response.setData(builder);
			response.setStatus(200);
			response.setError(false);
			response.setMessage("user register request");
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}
//		}else {
//			throw new InvalidException("something went wrong");
//		}
//			return null;
		return null;
		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<Response> registerResume(){
		List<ProfileDto> dtos=resumeBuilderService.getAll();
		if (dtos!=null) {
			response.setData(dtos);
			response.setStatus(200);
			response.setError(false);
			response.setMessage("get all success");
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}else {
			throw new InvalidException("something went wrong");
		}
	}
	
	@GetMapping("/getById/{employeeId}")
	public ResponseEntity<Response> getById(@PathVariable String employeeId){
		List<ProfileDto> profile=resumeBuilderService.getByEmployeeId( employeeId);
		if (profile!=null) {
			response.setData(profile);
			response.setStatus(200);
			response.setError(false);
			response.setMessage("getById all success");
			return new ResponseEntity<Response>(response, HttpStatus.ACCEPTED);
		}else {
			throw new InvalidException("something went wrong");
		}
	}


	}


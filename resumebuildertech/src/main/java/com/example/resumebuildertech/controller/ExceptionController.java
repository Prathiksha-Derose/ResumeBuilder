package com.example.resumebuildertech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.resumebuildertech.exception.InvalidException;
import com.example.resumebuildertech.exception.ResumeBuilderException;
import com.example.resumebuildertech.response.Response;
import com.example.resumebuildertech.service.EmployeeNotFoundException;

@ControllerAdvice
public class ExceptionController {
	
	@Autowired
	private Response response;
	private static final String ERRORMESSAGE="please Try Again";
	@ExceptionHandler(InvalidException.class)
	public ResponseEntity<Response> excepHandler(InvalidException employeeException) {
		response.setMessage(ERRORMESSAGE);
		response.setStatus(400);
		response.setData(employeeException.getMessage());
		response.setError(true);
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND); 	
	}
	
	@ExceptionHandler(ResumeBuilderException.class)
	public ResponseEntity<Response> excepHandler(ResumeBuilderException exception) {
		response.setMessage(ERRORMESSAGE);
		response.setStatus(400);
		response.setData(exception.getMessage());
		response.setError(true);
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND); 	
	}

	@ExceptionHandler(EmployeeNotFoundException.class)
	public ResponseEntity<Response> excepHandler(EmployeeNotFoundException exception) {
		response.setMessage(ERRORMESSAGE);
		response.setStatus(400);
		response.setData(exception.getMessage());
		response.setError(true);
		return new ResponseEntity<>(response,HttpStatus.NOT_FOUND); 	
	}
}
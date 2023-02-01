package com.example.resumebuildertech.exception;

public class ResumeBuilderException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6309572160816819012L;
	String message;

	public ResumeBuilderException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}

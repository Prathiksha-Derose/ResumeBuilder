package com.example.resumebuildertech.exception;


public class InvalidException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1617415945382944197L;
	private String message;

	public InvalidException(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
}

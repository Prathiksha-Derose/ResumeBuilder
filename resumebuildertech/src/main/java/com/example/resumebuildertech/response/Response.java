package com.example.resumebuildertech.response;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Response {

	private String message;
	private Boolean  error;
	private Integer status;
	private Object data;
}

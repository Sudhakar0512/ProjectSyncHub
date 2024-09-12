package com.dev.userservice.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ErrorDetais {
	
	public ErrorDetais(String error, String message, LocalDateTime timestamp) {
		super();
		this.error = error;
		this.message = message;
		this.timestamp = timestamp;
	}
	private String error;
	private String message;
	private LocalDateTime timestamp;

}

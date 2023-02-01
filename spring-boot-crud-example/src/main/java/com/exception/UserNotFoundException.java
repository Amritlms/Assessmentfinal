package com.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
	@SuppressWarnings("serial")
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public class UserNotFoundException extends RuntimeException
	{
	public UserNotFoundException(String message) 
	{
	//TODO Auto-generated constructor stub
	super(message);
	}
	}

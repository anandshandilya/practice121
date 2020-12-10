package com.fnpetal.leadMgmt.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class LeadNotFoundException extends RuntimeException {

	public LeadNotFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


	
}

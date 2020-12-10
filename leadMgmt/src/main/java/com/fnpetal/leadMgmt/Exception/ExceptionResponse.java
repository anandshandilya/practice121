package com.fnpetal.leadMgmt.Exception;

public class ExceptionResponse {
	
	private String status;
	private String message;
	
	public ExceptionResponse() {}
	
	public ExceptionResponse(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public String getMessage() {
		return message;
	}
	
	
	
	
	

}

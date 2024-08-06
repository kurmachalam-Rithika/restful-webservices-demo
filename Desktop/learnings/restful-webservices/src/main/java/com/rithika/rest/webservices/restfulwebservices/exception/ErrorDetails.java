package com.rithika.rest.webservices.restfulwebservices.exception;

import java.time.LocalDate;

public class ErrorDetails {
 
	private LocalDate timestamp;
	private String messsage;
	private String details;
	
	public ErrorDetails(LocalDate timestamp, String messsage, String details) {
		super();
		this.timestamp = timestamp;
		this.messsage = messsage;
		this.details = details;
	}

	public LocalDate getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDate timestamp) {
		this.timestamp = timestamp;
	}

	public String getMesssage() {
		return messsage;
	}

	public void setMesssage(String messsage) {
		this.messsage = messsage;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return "ErrorDetails [timestamp=" + timestamp + ", messsage=" + messsage + ", details=" + details + "]";
	}
	
}

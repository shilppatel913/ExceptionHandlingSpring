package com.masai.app.exception;


import java.time.LocalDateTime;

public class ErrorDetails {

	private String error_message;
	private LocalDateTime error_time;
	private String uri_details;
	public String getError_message() {
		return error_message;
	}
	public void setError_message(String error_message) {
		this.error_message = error_message;
	}
	public LocalDateTime getError_time() {
		return error_time;
	}
	public void setError_time(LocalDateTime error_time) {
		this.error_time = error_time;
	}
	public String getUri_details() {
		return uri_details;
	}
	public void setUri_details(String uri_details) {
		this.uri_details = uri_details;
	}
	public ErrorDetails(String error_message, LocalDateTime error_time, String uri_details) {
		super();
		this.error_message = error_message;
		this.error_time = error_time;
		this.uri_details = uri_details;
	}
	public ErrorDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "ErrorDetails [error_message=" + error_message + ", error_time=" + error_time + ", uri_details="
				+ uri_details + "]";
	}
	
	
	
}

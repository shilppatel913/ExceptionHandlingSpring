package com.masai.app.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<?> handleException(IllegalArgumentException ex,WebRequest req){
		ErrorDetails error=new ErrorDetails();
		error.setError_message(ex.getMessage());
		error.setError_time(LocalDateTime.now());
		error.setUri_details(req.getDescription(false));
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	} 
	
	
	/**Exception Handler for Validation**/
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<?> validException(MethodArgumentNotValidException ex){
		ErrorDetails error=new ErrorDetails();
		error.setError_message("Validation Error");
		error.setError_time(LocalDateTime.now());
		error.setUri_details(ex.getBindingResult().getFieldError().getDefaultMessage());
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
	/**To handle handler not found exception **/
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<?> noHandler(NoHandlerFoundException ex,WebRequest req){
		ErrorDetails error=new ErrorDetails();
		error.setError_message(ex.getMessage());
		error.setError_time(LocalDateTime.now());
		error.setUri_details(req.getDescription(false));
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.NOT_FOUND);
	}
	
	/**To handle validation for isVisible attribute **/
	@ExceptionHandler(InvalidIsVisibleException.class)
	public ResponseEntity<?> noHandler(InvalidIsVisibleException ex,WebRequest req){
		ErrorDetails error=new ErrorDetails();
		error.setError_message(ex.getMessage());
		error.setError_time(LocalDateTime.now());
		error.setUri_details(req.getDescription(false));
		return new ResponseEntity<ErrorDetails>(error,HttpStatus.BAD_REQUEST);
	}
	
}

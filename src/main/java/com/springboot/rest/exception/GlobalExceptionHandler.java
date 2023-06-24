package com.springboot.rest.exception;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundExcepion.class)
	public ResponseEntity<ErrorDetails> handleResourceNotFoundException(ResourceNotFoundExcepion exception,WebRequest request){
		ErrorDetails errorDetails=new ErrorDetails(exception.getMessage(),"NOT_FOUND",request.getDescription(false),new Date());
		return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.NOT_FOUND);
	}

}

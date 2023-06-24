package com.springboot.rest.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundExcepion extends RuntimeException {

	private String resource;
	private String feild;
	private Integer value;
	
	public ResourceNotFoundExcepion(String resource,String field,Integer id) {
		super(String.format("%s not found with %s : %s", resource,field,id));
		this.resource=resource;
		this.feild=field;
		this.value=id;
		
	}

}

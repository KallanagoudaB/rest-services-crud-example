package com.springboot.rest.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class ErrorDetails {
	private String errorMessage;
	private String errorCode;
	private String requestPath;
	Date dateTime;

}

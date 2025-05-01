package com.rest.service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MobileNotFoundException extends RuntimeException {

	public MobileNotFoundException(String msg) {
		super(msg);
	}
	

}

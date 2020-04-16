package com.educandoweb.course.services.exceptions;

public class DatabasesException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public DatabasesException (String msg) {
		super(msg);
	}
}

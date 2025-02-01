package com.devsuperior.demo.services.exceptions;

public class ResourceNotFoundExceception extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundExceception(String msg) {
		super(msg);
	}
}

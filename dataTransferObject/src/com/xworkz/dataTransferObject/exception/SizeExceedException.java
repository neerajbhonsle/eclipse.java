package com.xworkz.dataTransferObject.exception;

public class SizeExceedException extends RuntimeException {
	public SizeExceedException(String size) {
		super(size);
	}

}

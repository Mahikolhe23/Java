package com.app.exception;

@SuppressWarnings("serial")
public class CustomExpception extends RuntimeException {
	public CustomExpception(String msg) {
		super(msg);
	}
}

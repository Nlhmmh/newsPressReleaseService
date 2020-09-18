package com.jp.sense.pr.security.exception;

import org.springframework.security.core.AuthenticationException;

public class TooMuchAccountException extends AuthenticationException {

	public TooMuchAccountException(String msg) {
		super(msg);
	}
	
	public TooMuchAccountException(String msg, Throwable t) {
		super(msg, t);
	}
	
}

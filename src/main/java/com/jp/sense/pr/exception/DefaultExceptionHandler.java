package com.jp.sense.pr.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


/**
 * Global exception handler.
 *
 * @author Ryu
 */
@ControllerAdvice
public class DefaultExceptionHandler {
    @ExceptionHandler(value = Exception.class)
    public String exceptionHandler(Exception e) {
    	e.printStackTrace();
    	return "error-page.html";
    }
}

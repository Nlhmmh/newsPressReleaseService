package com.jp.sense.pr.exception;

/**
 * BeanUtils exception.
 *
 * @author Ryu
 */
public class BeanUtilsException extends RuntimeException {

    public BeanUtilsException(String message) {
        super(message);
    }

    public BeanUtilsException(String message, Throwable cause) {
        super(message, cause);
    }
}


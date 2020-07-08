package com.kcsj.sale.exception;

/**
 * 接单业务异常
 */
public class DemandException extends RuntimeException {

	public DemandException(String message) {
		super(message);
	}

	public DemandException(String message, Throwable cause) {
		super(message, cause);
	}

}


package com.kcsj.sale.exception;



/**
 * 该需求已经被其他Saler接单
 */
public class OrderGetException extends RuntimeException {

	public OrderGetException(String message) {
		super(message);
	}

	public OrderGetException(String message, Throwable cause) {
		super(message, cause);
	}

}


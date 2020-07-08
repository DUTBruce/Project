package com.kcsj.sale.exception;


/**
 * 该需求已经被其他Saler完成
 */
public class OrderDoneException extends RuntimeException {

	public OrderDoneException(String message) {
		super(message);
	}

	public OrderDoneException(String message, Throwable cause) {
		super(message, cause);
	}

}
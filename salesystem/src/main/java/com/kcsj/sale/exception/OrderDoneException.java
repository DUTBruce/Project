package com.kcsj.sale.exception;


/**
 * �������Ѿ�������Saler���
 */
public class OrderDoneException extends RuntimeException {

	public OrderDoneException(String message) {
		super(message);
	}

	public OrderDoneException(String message, Throwable cause) {
		super(message, cause);
	}

}
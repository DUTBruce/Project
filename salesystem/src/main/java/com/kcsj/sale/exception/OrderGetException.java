package com.kcsj.sale.exception;



/**
 * �������Ѿ�������Saler�ӵ�
 */
public class OrderGetException extends RuntimeException {

	public OrderGetException(String message) {
		super(message);
	}

	public OrderGetException(String message, Throwable cause) {
		super(message, cause);
	}

}


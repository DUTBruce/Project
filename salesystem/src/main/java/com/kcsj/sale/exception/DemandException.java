package com.kcsj.sale.exception;

/**
 * �ӵ�ҵ���쳣
 */
public class DemandException extends RuntimeException {

	public DemandException(String message) {
		super(message);
	}

	public DemandException(String message, Throwable cause) {
		super(message, cause);
	}

}


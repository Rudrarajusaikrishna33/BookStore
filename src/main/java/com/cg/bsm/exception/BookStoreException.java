package com.cg.bsm.exception;

@SuppressWarnings("serial")
public class BookStoreException extends Exception {
	public BookStoreException(String errMsg){
		super(errMsg);
	}
}
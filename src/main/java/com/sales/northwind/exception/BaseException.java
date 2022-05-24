package com.sales.northwind.exception;

public class BaseException extends RuntimeException{

    private static final long serialVersionUID = 1247618272755147319L;

    public BaseException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public BaseException(String s) {
        super(s);
    }
}

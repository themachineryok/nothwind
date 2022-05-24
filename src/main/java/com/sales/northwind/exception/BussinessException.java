package com.sales.northwind.exception;

public class BussinessException extends BaseException {

    private static final long serialVersionUID = -8660413495405182617L;

    public BussinessException(String s, Throwable throwable) {
        super(s, throwable);
    }

    public BussinessException(String s) {
        super(s);
    }

}

package com.sales.northwind.exception;

public class TechnicalException extends BaseException {

    private static final long serialVersionUID = -4179218676079051736L;

    public TechnicalException(String s, Throwable throwable) {
        super(s, throwable);
    }
}

package com.sales.northwind.constants;

public class HttpHeaders {

    public static final String X_SAN_HEADER = "x-san-correlationid";
    public static final String X_AUTHORIZATION = "x-authorization";
    public static final String X_NUP = "x-nup";
    public static final String X_PROCESS_CODE = "x-process-code";
    public static final String BEARER = "Bearer ";
    public static final int FIRST = 0;

    private HttpHeaders() throws IllegalAccessException {
        throw new IllegalAccessException();
    }
}

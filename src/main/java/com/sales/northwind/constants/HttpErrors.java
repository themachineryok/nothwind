package com.sales.northwind.constants;

public class HttpErrors {

    private HttpErrors() throws IllegalAccessException {
        throw new IllegalAccessException("Utility class");
    }

    public static final String INVALID_TOKEN = "Invalid token.";
    public static final String ABSENT_TOKEN = "Token not found in http headers.";


}
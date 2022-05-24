package com.sales.northwind.configuration.middleware;


import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Nullable;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Objects;
import java.util.UUID;

import static com.sales.northwind.constants.HttpHeaders.X_SAN_HEADER;
import static com.sales.northwind.constants.HttpHeaders.FIRST;

public class CorrelationIdInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(
            HttpServletRequest request, @Nullable HttpServletResponse response, @Nullable Object handler) throws Exception {

        String xSan = request.getHeader(X_SAN_HEADER);
        RequestAttributes attr = RequestContextHolder.getRequestAttributes();
        xSan = getUuid(xSan);
        if(Objects.nonNull(attr)){
            attr.setAttribute(X_SAN_HEADER, xSan, FIRST);
        }
        if(Objects.nonNull(response)) {
            response.setHeader(X_SAN_HEADER, xSan);
        }
        return true;
    }

    private String getUuid(String xSan) {

        UUID uuid;
        try{
            uuid = (Objects.isNull(xSan)) ? UUID.randomUUID() : UUID.fromString(xSan);
        } catch (IllegalArgumentException exception){
            uuid = UUID.randomUUID();
        }
        return uuid.toString();
    }
}

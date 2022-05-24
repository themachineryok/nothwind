package com.sales.northwind.configuration.handlers;


import com.sales.northwind.domain.RequestData;
import com.sales.northwind.dto.ErrorMessage;
import com.sales.northwind.exception.BaseException;
import com.sales.northwind.exception.BussinessException;
import com.sales.northwind.exception.TechnicalException;
import com.sales.northwind.service.MongoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.DefaultResponseErrorHandler;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

import static com.sales.northwind.constants.HttpHeaders.X_SAN_HEADER;
import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

@Slf4j
@RestControllerAdvice
public class ExceptionHandlerConfig extends DefaultResponseErrorHandler {


    private final MongoService mongoService;

    public ExceptionHandlerConfig(MongoService mongoService) {

        this.mongoService = mongoService;
    }

    @ExceptionHandler(value = {TechnicalException.class, BussinessException.class})
    @ResponseStatus(value = INTERNAL_SERVER_ERROR)
    public ErrorMessage authHandler(BaseException ex, HttpServletRequest request){

        log.error(ex.getMessage());
        log.debug(ex.getMessage(),ex);

        String correlationId = request.getHeader(X_SAN_HEADER);
        RequestData req = RequestData.builder()
                .path(request.getRequestURI())
                .statusCode(INTERNAL_SERVER_ERROR.value())
                .type(request.getMethod())
                .build();

        mongoService.trace(req, correlationId)
                .subscribe();

        return ErrorMessage.builder()
                .message(ex.getMessage())
                .error(INTERNAL_SERVER_ERROR.name())
                .timestamp(new Date())
                .build();
    }

}

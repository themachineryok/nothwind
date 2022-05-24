package com.sales.northwind.domain;

import lombok.Data;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
public class Processed {

    @Id
    private String id;

    private String correlationId;

    private RequestData details;

}

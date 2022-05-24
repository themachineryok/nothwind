package com.sales.northwind.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestData {
    //private String nup;
    private String process;
    private int statusCode;
    private Long timestamp;
    private String path;
    private String type;
}

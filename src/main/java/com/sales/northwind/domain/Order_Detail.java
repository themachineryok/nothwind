package com.sales.northwind.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Order_Detail {
    @Id
    private int OrderID;
    private int ProductID;
    private float UnitPrice;
    private float Quantity;
    private float Discount;

    private Product product;
}

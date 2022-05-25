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
public class Product {

    @Id
    private int ProductID;
    private String ProductName;
    private int SupplierID;
    private int CategoryID;
    private String QuantityPerUnit;
    private String UnitPrice;
    private int UnitsInStock;
    private int UnitsOnOrder;
    private int ReorderLevel;
    private int Discontinued;


    private Supplier supplier;
    private Category category;

}

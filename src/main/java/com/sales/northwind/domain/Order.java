package com.sales.northwind.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Order {
    @Id
    private int OrderID;
    private String CustomerID;
    private int EmployeeID;
    private String OrderDate;
    private String RequiredDate;
    private String ShippedDate;
    private int ShipVia;
    private String Freight;
    private String ShipName;
    private String ShipAddress;
    private String ShipCity;
    private String ShipRegion;
    private String ShipPostalCode;
    private String ShipCountry;

    private ArrayList<Order_Detail> details;
    private Customer customer;
    private Employee employee;
}

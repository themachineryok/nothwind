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
public class Employee {
    @Id
    private int EmployeeID;
    private String LastName;
    private String FirstName;
    private String Title;
    private String TitleOfCourtesy;
    private String BirthDate;
    private String HireDate;
    private String Address;
    private String City;
    private String Region;
    private String PostalCode;
    private String Country;
    private String HomePhone;
    private int Extension;
    private String Photo;
    private String Notes;
    private String ReportsTo;
    private String PhotoPath;
}

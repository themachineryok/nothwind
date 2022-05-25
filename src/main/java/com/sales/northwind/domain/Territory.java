package com.sales.northwind.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.persistence.Id;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Document
public class Territory {

    @Id
    private float TerritoryID;
    private String TerritoryDescription;
    private float RegionID;
}

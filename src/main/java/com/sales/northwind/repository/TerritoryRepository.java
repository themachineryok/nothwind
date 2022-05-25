package com.sales.northwind.repository;

import com.sales.northwind.domain.Territory;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface TerritoryRepository extends ReactiveMongoRepository<Territory, Integer> {
}

package com.sales.northwind.repository;

import com.sales.northwind.domain.Supplier;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface SupplierRepository extends ReactiveMongoRepository<Supplier, Integer> {
}

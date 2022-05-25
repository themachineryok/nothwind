package com.sales.northwind.repository;

import com.sales.northwind.domain.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, Integer> {
}

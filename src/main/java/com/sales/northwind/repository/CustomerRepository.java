package com.sales.northwind.repository;

import com.sales.northwind.domain.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, Integer> {
}

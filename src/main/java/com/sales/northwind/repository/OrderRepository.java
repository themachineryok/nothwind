package com.sales.northwind.repository;

import com.sales.northwind.domain.Order;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OrderRepository extends ReactiveMongoRepository<Order, Integer> {
}

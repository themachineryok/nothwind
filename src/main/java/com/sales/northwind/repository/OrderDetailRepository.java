package com.sales.northwind.repository;

import com.sales.northwind.domain.Order_Detail;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface OrderDetailRepository extends ReactiveMongoRepository<Order_Detail, Integer> {
}

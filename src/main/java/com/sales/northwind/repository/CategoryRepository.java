package com.sales.northwind.repository;

import com.sales.northwind.domain.Category;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface CategoryRepository extends ReactiveMongoRepository<Category, Integer> {
}

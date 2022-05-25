package com.sales.northwind.repository;

import com.sales.northwind.domain.Employee;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface EmployeeRepository extends ReactiveMongoRepository<Employee, Integer> {
}

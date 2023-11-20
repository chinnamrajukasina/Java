package com.example.organisation.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.organisation.dto.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {
    // Custom query methods can be defined here
}

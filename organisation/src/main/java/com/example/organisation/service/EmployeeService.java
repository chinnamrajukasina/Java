package com.example.organisation.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.organisation.dto.Employee;
import com.example.organisation.repository.EmployeeRepository;
import com.example.organisation.repository.OrganisationRepository;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    // Additional methods for update, delete, etc.


}

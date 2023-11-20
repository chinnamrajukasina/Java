package com.example.organisation.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.organisation.dto.Employee;
import com.example.organisation.dto.Organisation;
import com.example.organisation.repository.EmployeeRepository;
import com.example.organisation.repository.OrganisationRepository;

@Service
public class OrganisationService {
    @Autowired
    private OrganisationRepository organisationRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    public Organisation saveOrganisation(Organisation organisation) {
        return organisationRepository.save(organisation);
    }

    public List<Organisation> getAllOrganisation() {
        return organisationRepository.findAll();
    }
    
    public Optional<Organisation> getOrganisation(String id) {
        return organisationRepository.findById(id);
    }

    public Organisation addEmployeeToOrganisation(String organisationId, Employee employee) {
        Employee savedEmployee = employeeRepository.save(employee);
        Organisation organisation = organisationRepository.findById(organisationId).orElseThrow();
        if (organisation.getEmployees() == null) {
        	organisation.setEmployees(new ArrayList<>());
        }
        organisation.getEmployees().add(savedEmployee);
        return organisationRepository.save(organisation);
    }

    // Additional methods...
}

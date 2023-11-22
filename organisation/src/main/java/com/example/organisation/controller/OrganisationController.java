package com.example.organisation.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.organisation.dto.Employee;
import com.example.organisation.dto.Organisation;
import com.example.organisation.service.OrganisationService;

@RestController
@RequestMapping("/api/organisations")
public class OrganisationController {

    @Autowired
    private OrganisationService organisationService;

    @PostMapping
    public ResponseEntity<Organisation> createOrganisation(@RequestBody Organisation organisation) {
        Organisation savedOrganisation = organisationService.saveOrganisation(organisation);
        return ResponseEntity.ok(savedOrganisation);
    }
    
    @GetMapping
    public ResponseEntity<List<Organisation>> getOrganisations() {
        List<Organisation> savedOrganisation = organisationService.getAllOrganisation();
        return ResponseEntity.ok(savedOrganisation);
    }
    
    @GetMapping("/{organisationId}")
    public ResponseEntity<Optional<Organisation>> getOrganisations(@PathVariable String organisationId) {
        Optional<Organisation> savedOrganisation = organisationService.getOrganisation(organisationId);
        return ResponseEntity.ok(savedOrganisation);
    }

    @PostMapping("/{organisationId}/employees")
    public ResponseEntity<Organisation> addEmployeeToOrganisation(@PathVariable String organisationId, @RequestBody Employee employee) {
        Organisation updatedOrganisation = organisationService.addEmployeeToOrganisation(organisationId, employee);
        return ResponseEntity.ok(updatedOrganisation);
    }

    // Other endpoints...
    @GetMapping("/{organisationId}/employees")
    public ResponseEntity<List<Employee>> getEmployeesByOrganisation(@PathVariable String organisationId) {
        List<Employee> employees = organisationService.getEmployeesByOrganisation(organisationId);

        if (employees.isEmpty()) {
            return ResponseEntity.noContent().build(); // Return 204 No Content if the list is empty
        } else {
            return ResponseEntity.ok(employees); // Return 200 OK with the list of employees
        }
    }

}

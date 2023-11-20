package com.example.organisation.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import org.springframework.data.mongodb.core.mapping.DBRef;
import java.util.List;

@Document
@Data
public class Organisation {
    @Id
    private String id;
    private String name;
    private String address;

    @DBRef
    private List<Employee> employees; // List of employee references

    // Getters and setters
}

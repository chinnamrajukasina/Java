package com.example.organisation.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.organisation.dto.Organisation;

@Repository
public interface OrganisationRepository extends MongoRepository<Organisation, String> {
    // Custom query methods can be defined here
}

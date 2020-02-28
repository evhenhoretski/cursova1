package edu.evhen.cursova.dao.repository;

import edu.evhen.cursova.model.Headoffice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HeadofficeRepository extends MongoRepository<Headoffice, String> {
}

package edu.evhen.cursova.dao.repository;

import edu.evhen.cursova.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}

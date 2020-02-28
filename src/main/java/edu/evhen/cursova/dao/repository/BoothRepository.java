package edu.evhen.cursova.dao.repository;

import edu.evhen.cursova.model.Booth;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BoothRepository extends MongoRepository<Booth, String> {
}

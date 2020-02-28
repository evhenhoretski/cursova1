package edu.evhen.cursova.dao.repository;

import edu.evhen.cursova.model.Print;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PrintRepository extends MongoRepository<Print, String> {
}

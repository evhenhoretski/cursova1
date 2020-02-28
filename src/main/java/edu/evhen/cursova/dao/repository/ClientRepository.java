package edu.evhen.cursova.dao.repository;

import edu.evhen.cursova.model.Client;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<Client, String> {
}

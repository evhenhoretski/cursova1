package edu.evhen.cursova.dao.repository;

import edu.evhen.cursova.model.Provider;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProviderRepository extends MongoRepository<Provider, String> {
}

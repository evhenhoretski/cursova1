package edu.evhen.cursova.dao.repository;

import edu.evhen.cursova.model.Photocenter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotocenterRepository extends MongoRepository<Photocenter, String> {
}

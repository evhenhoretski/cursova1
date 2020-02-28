package edu.evhen.cursova.dao.repository;

import edu.evhen.cursova.model.Photoshop;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PhotoshopRepository extends MongoRepository<Photoshop, String> {
}

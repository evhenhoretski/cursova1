package edu.evhen.cursova.dao.repository;

import edu.evhen.cursova.model.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}

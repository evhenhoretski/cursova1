package edu.evhen.cursova.dao.repository;

import edu.evhen.cursova.model.Chapter;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChapterRepository extends MongoRepository<Chapter, String> {
}

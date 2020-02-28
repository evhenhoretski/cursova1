package edu.evhen.cursova.service.person.Interfecess;

import edu.evhen.cursova.model.Person;

import java.util.List;

public interface IPersonService {
    Person save(Person person);
    Person get(String id);
    List<Person> getAll();
    Person edit(Person person);
    Person delete(String id);
}

package edu.evhen.cursova.dao.person.interfeces;

import edu.evhen.cursova.model.Person;

import java.util.List;

public interface IPersonDao {
        Person save(Person person);
        Person get(String id);
        List<Person> getAll();
        Person edit(Person person);
        Person delete(String id);
}

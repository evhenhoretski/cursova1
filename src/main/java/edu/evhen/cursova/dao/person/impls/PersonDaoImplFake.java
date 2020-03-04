package edu.evhen.cursova.dao.person.impls;

import edu.evhen.cursova.dao.person.interfeces.IPersonDao;
import edu.evhen.cursova.dataSet.DataSet;
import edu.evhen.cursova.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PersonDaoImplFake implements IPersonDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Person save(Person person) {
        return null;
    }

    @Override
    public Person get(String id) {
        return null;
    }

    @Override
    public List<Person> getAll() {
        return dataSet.getPerson();
    }

    @Override
    public Person edit(Person person) {
        return null;
    }

    @Override
    public Person delete(String id) {
        return null;
    }
}

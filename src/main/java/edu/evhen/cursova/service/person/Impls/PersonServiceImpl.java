package edu.evhen.cursova.service.person.Impls;

import edu.evhen.cursova.dao.person.impls.PersonDaoImplFake;
import edu.evhen.cursova.dao.repository.PersonRepository;
import edu.evhen.cursova.model.Person;
import edu.evhen.cursova.service.person.Interfecess.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class PersonServiceImpl implements IPersonService {
    @Autowired
    PersonDaoImplFake dao;

    @Autowired
    PersonRepository repository;

    @PostConstruct
    void init(){
        List<Person> list = dao.getAll();
        repository.saveAll(list);
    }

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
        return repository.findAll();
    }

    @Override
    public Person edit(Person person) {
        return null;
    }

    @Override
    public Person delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}

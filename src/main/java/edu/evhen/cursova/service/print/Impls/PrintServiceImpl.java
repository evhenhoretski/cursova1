package edu.evhen.cursova.service.print.Impls;

import edu.evhen.cursova.dao.print.impls.PrintDaoImplFake;
import edu.evhen.cursova.dao.repository.PrintRepository;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Print;
import edu.evhen.cursova.service.print.Interfecess.IPrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PrintServiceImpl implements IPrintService {
    @Autowired
    PrintDaoImplFake dao;

    @Autowired
    PrintRepository repository;

    @PostConstruct
    void init(){
        List<Print> list = dao.getAll();
        //repository.saveAll(list);
    }

    @Override
    public Print save(Print print) {
        print.setDateCreated(LocalDateTime.now());
        print.setDateModified(LocalDateTime.now());
        return repository.save(print);
    }

    @Override
    public Print get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Print> getAll() {
        return repository.findAll();
    }

    @Override
    public Print edit(Print print) {
        print.setDateModified(LocalDateTime.now());
        return repository.save(print);
    }

    @Override
    public Print delete(String id) {
        Print print = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return print;
    }
}

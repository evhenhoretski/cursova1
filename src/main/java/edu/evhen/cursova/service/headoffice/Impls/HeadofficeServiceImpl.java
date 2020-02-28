package edu.evhen.cursova.service.headoffice.Impls;

import edu.evhen.cursova.dao.headoffice.impls.HeadofficeDaoImplFake;
import edu.evhen.cursova.dao.repository.HeadofficeRepository;
import edu.evhen.cursova.model.Headoffice;
import edu.evhen.cursova.service.headoffice.Interfecess.IHeadofficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class HeadofficeServiceImpl implements IHeadofficeService {
    @Autowired
    HeadofficeDaoImplFake dao;

    @Autowired
    HeadofficeRepository repository;

    @PostConstruct
    void init(){
        List<Headoffice> list = dao.getAll();
        repository.saveAll(list);
    }

    @Override
    public Headoffice save(Headoffice headoffice) {
        return null;
    }

    @Override
    public Headoffice get(String id) {
        return null;
    }

    @Override
    public List<Headoffice> getAll() {
        return repository.findAll();
    }

    @Override
    public Headoffice edit(Headoffice headoffice) {
        return null;
    }

    @Override
    public Headoffice delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}

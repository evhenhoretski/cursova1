package edu.evhen.cursova.service.booth.Impls;

import edu.evhen.cursova.dao.booth.impls.BoothDaoImplFake;
import edu.evhen.cursova.dao.photocenter.impls.PhotocenterDaoImplFake;
import edu.evhen.cursova.dao.repository.BoothRepository;
import edu.evhen.cursova.dao.repository.PhotocenterRepository;
import edu.evhen.cursova.model.Booth;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.booth.Interfecess.IBoothService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class BoothServiceImpl implements IBoothService {
    @Autowired
    BoothDaoImplFake dao;

    @Autowired
    BoothRepository repository;

    @PostConstruct
    void init(){
        List<Booth> list = dao.getAll();
        //repository.saveAll(list);
    }

    @Override
    public Booth save(Booth booth) {
        return repository.save(booth);
    }

    @Override
    public Booth get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Booth> getAll() {
        return repository.findAll();
    }

    @Override
    public Booth edit(Booth booth) {
        return repository.save(booth);
    }

    @Override
    public Booth delete(String id) {
        Booth booth = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return booth;
    }
}

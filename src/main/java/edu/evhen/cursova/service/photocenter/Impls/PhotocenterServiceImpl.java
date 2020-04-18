package edu.evhen.cursova.service.photocenter.Impls;

import edu.evhen.cursova.dao.photocenter.impls.PhotocenterDaoImplFake;
import edu.evhen.cursova.dao.photocenter.interfeces.IPhotocenterDao;
import edu.evhen.cursova.dao.repository.PhotocenterRepository;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.photocenter.Interfecess.IPhotocenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhotocenterServiceImpl implements IPhotocenterService {
    @Autowired
    PhotocenterDaoImplFake dao;

    @Autowired
    PhotocenterRepository repository;

    @PostConstruct
    void init(){
        List<Photocenter> list = dao.getAll();
        //repository.saveAll(list);
    }

    @Override
    public Photocenter save(Photocenter photocenter) {
        return repository.save(photocenter);
    }

    @Override
    public Photocenter get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Photocenter> getAll() {
        return repository.findAll();
    }

    @Override
    public Photocenter edit(Photocenter photocenter) {
        return repository.save(photocenter);
    }

    @Override
    public Photocenter delete(String id) {
        Photocenter photocenter = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return photocenter;
//        repository.deleteById(id);
//        return repository.findById(id).orElse(null);
    }

    public List<Photocenter> search(String word) {
        return this.getAll().stream()
                .filter(photocenter -> photocenter.getOrder()
                        .toLowerCase().contains(word.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Photocenter> sortByName() {
        return this.getAll().stream().sorted(Comparator.comparing(Photocenter::getProceeds))
                .collect(Collectors.toList());
    }
}

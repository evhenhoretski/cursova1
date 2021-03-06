package edu.evhen.cursova.service.photoshop.Impls;

import edu.evhen.cursova.dao.photoshop.impls.PhotoshopDaoImplFake;
import edu.evhen.cursova.dao.repository.PhotoshopRepository;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Photoshop;
import edu.evhen.cursova.service.photoshop.Interfecess.IPhotoshopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class PhotoshopServiceImpl implements IPhotoshopService {
    @Autowired
    PhotoshopDaoImplFake dao;

    @Autowired
    PhotoshopRepository repository;

    @PostConstruct
    void init(){
        List<Photoshop> list = dao.getAll();
        repository.saveAll(list);
    }

    @Override
    public Photoshop save(Photoshop photoshop) {
        return repository.save(photoshop);
    }

    @Override
    public Photoshop get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Photoshop> getAll() {
        return repository.findAll();
    }

    @Override
    public Photoshop edit(Photoshop photoshop) {
        return repository.save(photoshop);
    }

    @Override
    public Photoshop delete(String id) {
        Photoshop photoshop = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return photoshop;
    }

    public List<Photoshop> search(String word) {
        return this.getAll().stream()
                .filter(photoshop -> photoshop.getSelling()
                        .toLowerCase().contains(word.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Photoshop> sortByName() {
        return this.getAll().stream().sorted(Comparator.comparing(Photoshop::getSelling))
                .collect(Collectors.toList());
    }
}

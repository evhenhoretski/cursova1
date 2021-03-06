package edu.evhen.cursova.service.headoffice.Impls;

import edu.evhen.cursova.dao.headoffice.impls.HeadofficeDaoImplFake;
import edu.evhen.cursova.dao.repository.HeadofficeRepository;
import edu.evhen.cursova.model.Headoffice;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.headoffice.Interfecess.IHeadofficeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        return repository.save(headoffice);
    }

    @Override
    public Headoffice get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Headoffice> getAll() {
        return repository.findAll();
    }

    @Override
    public Headoffice edit(Headoffice headoffice) {
        return repository.save(headoffice);
    }

    @Override
    public Headoffice delete(String id) {
        Headoffice headoffice = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return headoffice;
    }

    public List<Headoffice> search(String word) {
        return this.getAll().stream()
                .filter(headoffice -> headoffice.getAdress()
                        .toLowerCase().contains(word.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Headoffice> sortByName() {
        return this.getAll().stream().sorted(Comparator.comparing(Headoffice::getAdress))
                .collect(Collectors.toList());
    }
}

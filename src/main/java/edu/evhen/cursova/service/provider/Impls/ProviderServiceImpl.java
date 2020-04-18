package edu.evhen.cursova.service.provider.Impls;

import edu.evhen.cursova.dao.print.impls.PrintDaoImplFake;
import edu.evhen.cursova.dao.provider.impls.ProviderDaoImplFake;
import edu.evhen.cursova.dao.repository.ProviderRepository;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Provider;
import edu.evhen.cursova.service.provider.Interfecess.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProviderServiceImpl implements IProviderService {
    @Autowired
    ProviderDaoImplFake dao;

    @Autowired
    ProviderRepository repository;

    @PostConstruct
    void init(){
        List<Provider> list = dao.getAll();
        repository.saveAll(list);
    }

    @Override
    public Provider save(Provider provider) {
        return repository.save(provider);
    }

    @Override
    public Provider get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Provider> getAll() {
        return repository.findAll();
    }

    @Override
    public Provider edit(Provider provider) {
        return repository.save(provider);
    }

    @Override
    public Provider delete(String id) {
        Provider provider = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return provider;
    }

    public List<Provider> search(String word) {
        return this.getAll().stream()
                .filter(provider -> provider.getName()
                        .toLowerCase().contains(word.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Provider> sortByName() {
        return this.getAll().stream().sorted(Comparator.comparing(Provider::getName))
                .collect(Collectors.toList());
    }
}

package edu.evhen.cursova.service.provider.Impls;

import edu.evhen.cursova.dao.print.impls.PrintDaoImplFake;
import edu.evhen.cursova.dao.provider.impls.ProviderDaoImplFake;
import edu.evhen.cursova.dao.repository.ProviderRepository;
import edu.evhen.cursova.model.Provider;
import edu.evhen.cursova.service.provider.Interfecess.IProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

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
        return null;
    }

    @Override
    public Provider get(String id) {
        return null;
    }

    @Override
    public List<Provider> getAll() {
        return repository.findAll();
    }

    @Override
    public Provider edit(Provider provider) {
        return null;
    }

    @Override
    public Provider delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}

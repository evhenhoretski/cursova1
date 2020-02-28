package edu.evhen.cursova.service.client.Impls;

import edu.evhen.cursova.dao.client.impls.ClientDaoImplFake;
import edu.evhen.cursova.dao.photocenter.impls.PhotocenterDaoImplFake;
import edu.evhen.cursova.dao.repository.ClientRepository;
import edu.evhen.cursova.dao.repository.PhotocenterRepository;
import edu.evhen.cursova.model.Client;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.client.Interfecess.IClientService;
import edu.evhen.cursova.service.photocenter.Interfecess.IPhotocenterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.Cleaner;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {
    @Autowired
    ClientDaoImplFake dao;

    @Autowired
    ClientRepository repository;

    @PostConstruct
    void init(){
        List<Client> list = dao.getAll();
        repository.saveAll(list);
    }

    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public Client get(String id) {
        return null;
    }

    @Override
    public List<Client> getAll() {
        return repository.findAll();
    }

    @Override
    public Client edit(Client client) {
        return null;
    }

    @Override
    public Client delete(String id) {
        repository.deleteById(id);
        return repository.findById(id).orElse(null);
    }
}

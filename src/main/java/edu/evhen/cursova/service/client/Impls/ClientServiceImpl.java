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
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        return repository.save(client);
    }

    @Override
    public Client get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Client> getAll() {
        return repository.findAll();
    }

    @Override
    public Client edit(Client client) {
        return repository.save(client);
    }

    @Override
    public Client delete(String id) {
        Client client = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return client;
    }

    public List<Client> search(String word) {
        return this.getAll().stream()
                .filter(client -> client.getAmateurs()
                        .toLowerCase().contains(word.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Client> sortByName() {
        return this.getAll().stream().sorted(Comparator.comparing(Client::getAmateurs))
                .collect(Collectors.toList());
    }
}

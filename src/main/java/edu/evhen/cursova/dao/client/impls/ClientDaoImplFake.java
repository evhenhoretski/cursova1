package edu.evhen.cursova.dao.client.impls;

import edu.evhen.cursova.dataSet.DataSet;
import edu.evhen.cursova.model.Client;
import edu.evhen.cursova.service.client.Interfecess.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClientDaoImplFake implements IClientService {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getClients();
    }

    @Override
    public Client edit(Client client) {
        return null;
    }

    @Override
    public Client delete(String id) {
        return null;
    }
}

package edu.evhen.cursova.dao.client.interfeces;

import edu.evhen.cursova.model.Client;

import java.util.List;

public interface IClientDao {
        Client save(Client client);
        Client get(String id);
        List<Client> getAll();
        Client edit(Client client);
        Client delete(String id);
}

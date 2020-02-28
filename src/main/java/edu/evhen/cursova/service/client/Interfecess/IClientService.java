package edu.evhen.cursova.service.client.Interfecess;

import edu.evhen.cursova.model.Client;
import edu.evhen.cursova.model.Photocenter;

import java.util.List;

public interface IClientService {
    Client save(Client client);
    Client get(String id);
    List<Client> getAll();
    Client edit(Client client);
    Client delete(String id);
}

package edu.evhen.cursova.service.provider.Interfecess;

import edu.evhen.cursova.model.Provider;

import java.util.List;

public interface IProviderService {
    Provider save(Provider provider);
    Provider get(String id);
    List<Provider> getAll();
    Provider edit(Provider provider);
    Provider delete(String id);
}

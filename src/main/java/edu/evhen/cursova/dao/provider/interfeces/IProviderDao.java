package edu.evhen.cursova.dao.provider.interfeces;

import edu.evhen.cursova.model.Provider;

import java.util.List;

public interface IProviderDao {
        Provider save(Provider provider);
        Provider get(String id);
        List<Provider> getAll();
        Provider edit(Provider provider);
        Provider delete(String id);
}

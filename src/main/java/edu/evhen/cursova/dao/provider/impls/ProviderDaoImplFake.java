package edu.evhen.cursova.dao.provider.impls;

import edu.evhen.cursova.dao.provider.interfeces.IProviderDao;
import edu.evhen.cursova.dataSet.DataSet;
import edu.evhen.cursova.model.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProviderDaoImplFake implements IProviderDao {
    @Autowired
    DataSet dataSet;

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
        return dataSet.getProviders();
    }

    @Override
    public Provider edit(Provider provider) {
        return null;
    }

    @Override
    public Provider delete(String id) {
        return null;
    }
}

package edu.evhen.cursova.dao.booth.impls;

import edu.evhen.cursova.dao.booth.interfeces.IBoothDao;
import edu.evhen.cursova.dataSet.DataSet;
import edu.evhen.cursova.model.Booth;
import edu.evhen.cursova.model.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BoothDaoImplFake implements IBoothDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Booth save(Booth booth) {
        return null;
    }

    @Override
    public Booth get(String id) {
        return null;
    }

    @Override
    public List<Booth> getAll() {
        return dataSet.getBooths();
    }

    @Override
    public Booth edit(Booth booth) {
        return null;
    }

    @Override
    public Booth delete(String id) {
        return null;
    }
}

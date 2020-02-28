package edu.evhen.cursova.dao.photoshop.impls;

import edu.evhen.cursova.dao.photoshop.interfeces.IPhotoshopDao;
import edu.evhen.cursova.dataSet.DataSet;
import edu.evhen.cursova.model.Photoshop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhotoshopDaoImplFake implements IPhotoshopDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Photoshop save(Photoshop photoshop) {
        return null;
    }

    @Override
    public Photoshop get(String id) {
        return null;
    }

    @Override
    public List<Photoshop> getAll() {
        return dataSet.getPhotoshops();
    }

    @Override
    public Photoshop edit(Photoshop photoshop) {
        return null;
    }

    @Override
    public Photoshop delete(String id) {
        return null;
    }
}

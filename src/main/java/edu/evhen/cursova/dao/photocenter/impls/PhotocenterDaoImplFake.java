package edu.evhen.cursova.dao.photocenter.impls;

import edu.evhen.cursova.dao.photocenter.interfeces.IPhotocenterDao;
import edu.evhen.cursova.dataSet.DataSet;
import edu.evhen.cursova.model.Photocenter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PhotocenterDaoImplFake implements IPhotocenterDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Photocenter save(Photocenter photocenter) {
        return null;
    }

    @Override
    public Photocenter get(String id) {
        return null;
    }

    @Override
    public List<Photocenter> getAll() {
        return dataSet.getPhotocenters();
    }

    @Override
    public Photocenter edit(Photocenter photocenter) {
        return null;
    }

    @Override
    public Photocenter delete(String id) {
        return null;
    }
}

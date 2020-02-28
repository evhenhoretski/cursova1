package edu.evhen.cursova.dao.headoffice.impls;

import edu.evhen.cursova.dao.headoffice.interfeces.IHeadofficeDao;
import edu.evhen.cursova.dataSet.DataSet;
import edu.evhen.cursova.model.Headoffice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class HeadofficeDaoImplFake implements IHeadofficeDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Headoffice save(Headoffice headoffice) {
        return null;
    }

    @Override
    public Headoffice get(String id) {
        return null;
    }

    @Override
    public List<Headoffice> getAll() {
        return dataSet.getHeadoffices();
    }

    @Override
    public Headoffice edit(Headoffice headoffice) {
        return null;
    }

    @Override
    public Headoffice delete(String id) {
        return null;
    }
}

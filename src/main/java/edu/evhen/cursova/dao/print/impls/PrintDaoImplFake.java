package edu.evhen.cursova.dao.print.impls;

import edu.evhen.cursova.dao.photocenter.interfeces.IPhotocenterDao;
import edu.evhen.cursova.dao.print.interfeces.IPrintDao;
import edu.evhen.cursova.dataSet.DataSet;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Print;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PrintDaoImplFake implements IPrintDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Print save(Print print) {
        return null;
    }

    @Override
    public Print get(String id) {
        return null;
    }

    @Override
    public List<Print> getAll() {
        return dataSet.getPrints();
    }

    @Override
    public Print edit(Print print) {
        return null;
    }

    @Override
    public Print delete(String id) {
        return null;
    }
}

package edu.evhen.cursova.dao.headoffice.interfeces;

import edu.evhen.cursova.model.Headoffice;

import java.util.List;

public interface IHeadofficeDao {
        Headoffice save(Headoffice headoffice);
        Headoffice get(String id);
        List<Headoffice> getAll();
        Headoffice edit(Headoffice headoffice);
        Headoffice delete(String id);
}

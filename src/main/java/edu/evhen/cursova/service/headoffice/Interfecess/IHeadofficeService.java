package edu.evhen.cursova.service.headoffice.Interfecess;

import edu.evhen.cursova.model.Headoffice;

import java.util.List;

public interface IHeadofficeService {
    Headoffice save(Headoffice headoffice);
    Headoffice get(String id);
    List<Headoffice> getAll();
    Headoffice edit(Headoffice headoffice);
    Headoffice delete(String id);
}

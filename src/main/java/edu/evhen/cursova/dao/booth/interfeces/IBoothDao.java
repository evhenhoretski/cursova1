package edu.evhen.cursova.dao.booth.interfeces;

import edu.evhen.cursova.model.Booth;

import java.util.List;

public interface IBoothDao {
        Booth save(Booth booth);
        Booth get(String id);
        List<Booth> getAll();
        Booth edit(Booth booth);
        Booth delete(String id);
}

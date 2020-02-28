package edu.evhen.cursova.service.booth.Interfecess;

import edu.evhen.cursova.model.Booth;

import java.util.List;

public interface IBoothService {
    Booth save(Booth booth);
    Booth get(String id);
    List<Booth> getAll();
    Booth edit(Booth booth);
    Booth delete(String id);
}

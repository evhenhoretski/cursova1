package edu.evhen.cursova.service.photocenter.Interfecess;

import edu.evhen.cursova.model.Photocenter;

import java.util.List;

public interface IPhotocenterService {
    Photocenter save(Photocenter photocenter);
    Photocenter get(String id);
    List<Photocenter> getAll();
    Photocenter edit(Photocenter photocenter);
    Photocenter delete(String id);
}

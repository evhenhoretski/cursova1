package edu.evhen.cursova.dao.photocenter.interfeces;

import edu.evhen.cursova.model.Photocenter;

import java.util.List;

public interface IPhotocenterDao {
        Photocenter save(Photocenter photocenter);
        Photocenter get(String id);
        List<Photocenter> getAll();
        Photocenter edit(Photocenter photocenter);
        Photocenter delete(String id);
}

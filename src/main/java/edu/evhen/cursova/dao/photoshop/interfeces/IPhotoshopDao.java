package edu.evhen.cursova.dao.photoshop.interfeces;

import edu.evhen.cursova.model.Photoshop;

import java.util.List;

public interface IPhotoshopDao {
        Photoshop save(Photoshop photocenter);
        Photoshop get(String id);
        List<Photoshop> getAll();
        Photoshop edit(Photoshop photoshop);
        Photoshop delete(String id);
}

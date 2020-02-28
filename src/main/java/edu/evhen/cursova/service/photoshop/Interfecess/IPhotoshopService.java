package edu.evhen.cursova.service.photoshop.Interfecess;

import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Photoshop;

import java.util.List;

public interface IPhotoshopService {
    Photoshop save(Photoshop photoshop);
    Photoshop get(String id);
    List<Photoshop> getAll();
    Photoshop edit(Photoshop photoshop);
    Photoshop delete(String id);
}

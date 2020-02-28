package edu.evhen.cursova.service.print.Interfecess;

import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.model.Print;

import java.util.List;

public interface IPrintService {
    Print save(Print print);
    Print get(String id);
    List<Print> getAll();
    Print edit(Print print);
    Print delete(String id);
}

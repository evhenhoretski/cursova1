package edu.evhen.cursova.dao.print.interfeces;

import edu.evhen.cursova.model.Print;

import java.util.List;

public interface IPrintDao {
        Print save(Print print);
        Print get(String id);
        List<Print> getAll();
        Print edit(Print print);
        Print delete(String id);
}

package edu.evhen.cursova.service.chapter.Interfecess;

import edu.evhen.cursova.model.Booth;
import edu.evhen.cursova.model.Chapter;
import edu.evhen.cursova.model.Photocenter;

import java.util.List;

public interface IChapterService {
    Chapter save(Chapter chapter);
    Chapter get(String id);
    List<Chapter> getAll();
    Chapter edit(Chapter chapter);
    Chapter delete(String id);
}

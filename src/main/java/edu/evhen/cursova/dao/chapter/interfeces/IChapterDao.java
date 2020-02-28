package edu.evhen.cursova.dao.chapter.interfeces;

import edu.evhen.cursova.model.Chapter;

import java.util.List;

public interface IChapterDao {
        Chapter save(Chapter chapter);
        Chapter get(String id);
        List<Chapter> getAll();
        Chapter edit(Chapter chapter);
        Chapter delete(String id);
}

package edu.evhen.cursova.dao.chapter.impls;

import edu.evhen.cursova.dao.chapter.interfeces.IChapterDao;
import edu.evhen.cursova.dataSet.DataSet;
import edu.evhen.cursova.model.Chapter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ChapterDaoImplFake implements IChapterDao {
    @Autowired
    DataSet dataSet;

    @Override
    public Chapter save(Chapter chapter) {
        return null;
    }

    @Override
    public Chapter get(String id) {
        return null;
    }

    @Override
    public List<Chapter> getAll() {
        return dataSet.getChapters();
    }

    @Override
    public Chapter edit(Chapter chapter) {
        return null;
    }

    @Override
    public Chapter delete(String id) {
        return null;
    }
}

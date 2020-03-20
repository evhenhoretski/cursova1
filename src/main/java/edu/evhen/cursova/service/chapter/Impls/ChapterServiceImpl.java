package edu.evhen.cursova.service.chapter.Impls;

import edu.evhen.cursova.dao.chapter.impls.ChapterDaoImplFake;
import edu.evhen.cursova.dao.repository.ChapterRepository;
import edu.evhen.cursova.model.Chapter;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.chapter.Interfecess.IChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
public class ChapterServiceImpl implements IChapterService {
    @Autowired
    ChapterDaoImplFake dao;

    @Autowired
    ChapterRepository repository;

    @PostConstruct
    void init(){
        List<Chapter> list = dao.getAll();
        //repository.saveAll(list);
    }

    @Override
    public Chapter save(Chapter chapters) {
        return repository.save(chapters);
    }

    @Override
    public Chapter get(String id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<Chapter> getAll() {
        return repository.findAll();
    }

    @Override
    public Chapter edit(Chapter chapter) {
        return repository.save(chapter);
    }

    @Override
    public Chapter delete(String id) {
        Chapter chapter = repository.findById(id).orElse(null);
        repository.deleteById(id);
        return chapter;
    }
}

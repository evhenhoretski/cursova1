package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Chapter;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.chapter.Impls.ChapterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/chapter")
public class ChapterAPIController {
    @Autowired
    ChapterServiceImpl service;

    @RequestMapping("/list")
    List<Chapter> getAll(){
        return service.getAll();
    }

    @RequestMapping("/{id}")
    Chapter getById(@PathVariable("id") String id) {
        return service.get(id);
    }


    @RequestMapping(value = "/create", method = RequestMethod.POST)
    Chapter create(@RequestBody Chapter chapter) {
        return service.save(chapter);
    }


    @RequestMapping("/delete/{id}")
    Chapter delete(@PathVariable("id") String id){
        return service.delete(id);
    }

}

package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.model.Chapter;
import edu.evhen.cursova.service.chapter.Impls.ChapterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("chapter", service.getAll());
        return "chapterList";
    }

}

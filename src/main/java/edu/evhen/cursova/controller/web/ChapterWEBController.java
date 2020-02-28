package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.service.chapter.Impls.ChapterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/web/chapter")
public class ChapterWEBController {
    @Autowired
    ChapterServiceImpl service;

    @RequestMapping("/list")
    String getAll(Model model){
        model.addAttribute("chapters", service.getAll());
        return "chapterList";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("chapters", service.getAll());
        return "chapterList";
    }

}

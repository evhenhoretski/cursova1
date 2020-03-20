package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.form.ChapterForm;
import edu.evhen.cursova.model.Chapter;
import edu.evhen.cursova.service.chapter.Impls.ChapterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
        return "redirect:/web/chapter/list";
    }


    @RequestMapping(value = "create", method = RequestMethod.GET)
    String create(Model model){
        ChapterForm chapterForm = new ChapterForm();
        model.addAttribute("chapterForm", chapterForm);
        return "chapterAdd";
    }

    @RequestMapping(value = "create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("chapterForm") ChapterForm chapterForm){
        Chapter chapter = new Chapter();
        chapter.setAdress(chapterForm.getAdress());
        chapter.setWorkplace(chapterForm.getWorkplace());
        chapter.setBooth(chapterForm.getBooth());
        chapter.setImplemintation(chapterForm.getImplemintation());
        chapter.setManifestation(chapterForm.getManifestation());
        chapter.setPrinting(chapterForm.getPrinting());
        chapter.setUrgent(chapterForm.getUrgent());
        chapter.setDiscountcard(chapterForm.getDiscountcard());
        chapter.setFilm(chapterForm.getFilm());
        chapter.setSale(chapterForm.getSale());
        chapter.setProceeds(chapterForm.getProceeds());
        chapter.setGoods(chapterForm.getGoods());
        chapter.setPhotocenter(chapterForm.getPhotocenter());
        service.save(chapter);
        model.addAttribute("chapters", service.getAll());
        return "redirect:/web/chapter/list";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id){
        Chapter chapter = service.get(id);
        ChapterForm chapterForm = new ChapterForm();
        chapterForm.setAdress(chapter.getAdress());
        chapterForm.setWorkplace(chapter.getWorkplace());
        chapterForm.setBooth(chapter.getBooth());
        chapterForm.setImplemintation(chapter.getImplemintation());
        chapterForm.setManifestation(chapter.getManifestation());
        chapterForm.setPrinting(chapter.getPrinting());
        chapterForm.setUrgent(chapter.getUrgent());
        chapterForm.setDiscountcard(chapter.getDiscountcard());
        chapterForm.setFilm(chapter.getFilm());
        chapterForm.setSale(chapter.getSale());
        chapterForm.setProceeds(chapter.getProceeds());
        chapterForm.setGoods(chapter.getGoods());
        chapterForm.setPhotocenter(chapter.getPhotocenter());
        model.addAttribute("chapterForm", chapterForm);
        return "chapterAdd";
    }

    @RequestMapping(value = "edit/{id}", method = RequestMethod.POST)
    String edit(Model model,  @PathVariable("id") String id, @ModelAttribute("chapterForm") ChapterForm chapterForm){
        Chapter chapter = new Chapter();
        chapter.setId(id);
        chapter.setAdress(chapterForm.getAdress());
        chapter.setWorkplace(chapterForm.getWorkplace());
        chapter.setBooth(chapterForm.getBooth());
        chapter.setImplemintation(chapterForm.getImplemintation());
        chapter.setManifestation(chapterForm.getManifestation());
        chapter.setPrinting(chapterForm.getPrinting());
        chapter.setUrgent(chapterForm.getUrgent());
        chapter.setDiscountcard(chapterForm.getDiscountcard());
        chapter.setFilm(chapterForm.getFilm());
        chapter.setSale(chapterForm.getSale());
        chapter.setProceeds(chapterForm.getProceeds());
        chapter.setGoods(chapterForm.getGoods());
        chapter.setPhotocenter(chapterForm.getPhotocenter());
        service.save(chapter);
        model.addAttribute("chapters", service.getAll());
        return "redirect:/web/chapter/list";
    }

}

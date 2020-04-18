package edu.evhen.cursova.controller.web;

import edu.evhen.cursova.forms.ChapterForm;
import edu.evhen.cursova.forms.PhotocenterForm;
import edu.evhen.cursova.forms.SearchForm;
import edu.evhen.cursova.model.Chapter;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.chapter.Impls.ChapterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String showAll(Model model) {
        List<Chapter> list = service.getAll();
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("chapters", list);
        return "chapterList";
    }
    @PostMapping(value = "/list")
    public String search(Model model,
                         @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Chapter> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("chapters", list);
        return "chapterList";
    }



    @RequestMapping(value = "/list/sorted", method = RequestMethod.GET)
    String sort(Model model){
        List<Chapter> list = service.sortByName();
        model.addAttribute("chapters", list);
        SearchForm searchForm = new SearchForm();
        model.addAttribute("searchForm", searchForm);
        return "chapterList";
    }

    @RequestMapping(value = "/list/sorted", method = RequestMethod.POST)
    public String searchSorted(Model model,
                               @ModelAttribute("searchForm") SearchForm searchForm) {
        String word = searchForm.getString();
        List<Chapter> list = service.search(word);
        model.addAttribute("searchForm", searchForm);
        model.addAttribute("chapters", list);
        return "chapterList";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model) {
        ChapterForm chapterForm = new ChapterForm();
        model.addAttribute("chapterForm", chapterForm);
        return "chapterAdd";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(Model model, @ModelAttribute("chapterForm") ChapterForm chapterForm) {
        Chapter chapter = new Chapter();
        chapter.setAdress(chapterForm.getAdress());
        chapter.setBooth(chapterForm.getBooth());
        chapter.setDiscountcard(chapterForm.getDiscountcard());
        chapter.setFilm(chapterForm.getFilm());
        chapter.setGoods(chapterForm.getGoods());
        chapter.setImplemintation(chapterForm.getImplemintation());
        chapter.setManifestation(chapterForm.getManifestation());
        chapter.setPhotocenter(chapterForm.getPhotocenter());
        chapter.setPrinting(chapterForm.getPrinting());
        chapter.setProceeds(chapterForm.getProceeds());
        chapter.setSale(chapterForm.getSale());
        chapter.setUrgent(chapterForm.getUrgent());
        chapter.setWorkplace(chapterForm.getWorkplace());
        service.save(chapter);
        model.addAttribute("chapters", service.getAll());
        return "redirect:/web/chapter/list";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.GET)
    String edit(Model model, @PathVariable("id") String id) {
        Chapter chapter = service.get(id);
        ChapterForm chapterForm = new ChapterForm();
        chapterForm.setAdress(chapter.getAdress());
        chapterForm.setBooth(chapter.getBooth());
        chapterForm.setDiscountcard(chapter.getDiscountcard());
        chapterForm.setFilm(chapter.getFilm());
        chapterForm.setGoods(chapter.getGoods());
        chapterForm.setImplemintation(chapter.getImplemintation());
        chapterForm.setManifestation(chapter.getManifestation());
        chapterForm.setPhotocenter(chapter.getPhotocenter());
        chapterForm.setPrinting(chapter.getPrinting());
        chapterForm.setProceeds(chapter.getProceeds());
        chapterForm.setSale(chapter.getSale());
        chapterForm.setUrgent(chapter.getUrgent());
        chapterForm.setWorkplace(chapter.getWorkplace());
        model.addAttribute("chapterForm", chapterForm);
        return "chapterAdd";
    }

    @RequestMapping(value = "/edit/{id}", method = RequestMethod.POST)
    String edit(Model model, @PathVariable("id") String id, @ModelAttribute("chapterForm") ChapterForm chapterForm) {
        Chapter chapter = new Chapter();
        chapter.setId(id);
        chapter.setAdress(chapterForm.getAdress());
        chapter.setBooth(chapterForm.getBooth());
        chapter.setDiscountcard(chapterForm.getDiscountcard());
        chapter.setFilm(chapterForm.getFilm());
        chapter.setGoods(chapterForm.getGoods());
        chapter.setImplemintation(chapterForm.getImplemintation());
        chapter.setManifestation(chapterForm.getManifestation());
        chapter.setPhotocenter(chapterForm.getPhotocenter());
        chapter.setPrinting(chapterForm.getPrinting());
        chapter.setProceeds(chapterForm.getProceeds());
        chapter.setSale(chapterForm.getSale());
        chapter.setUrgent(chapterForm.getUrgent());
        chapter.setWorkplace(chapterForm.getWorkplace());
        service.save(chapter);
        model.addAttribute("chapters", service.getAll());
        return "redirect:/web/chapter/list";
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id) {
        service.delete(id);
        model.addAttribute("chapters", service.getAll());
        return "redirect:/web/chapter/list";
    }

}

package edu.evhen.cursova.controller.api;

import edu.evhen.cursova.forms.PhotocenterForm;
import edu.evhen.cursova.model.Photocenter;
import edu.evhen.cursova.service.photocenter.Impls.PhotocenterServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/photocenter")
public class PhotocenterAPIController {
    @Autowired
    PhotocenterServiceImpl service;

    @RequestMapping("/list")
    List<Photocenter> getAll(){
        return service.getAll();
    }

    @PostMapping("/create")
    Photocenter createGroupPost(@RequestBody PhotocenterForm photocenterForm){
        Photocenter photocenter = service.get(PhotocenterForm.getGroup());
        Photocenter photocenter = new Photocenter(photocenterForm.getId(), photocenterForm.getProceeds(),
                photocenterForm.getOrder(), photocenterForm.getWorkplace(), photocenter());
        return this.service.create(photocenter);
        // return student;
    }



    @PostMapping("/update")
    Photocenter updateGroupPost(@RequestBody Photocenter photocenter){
//        this.service.create(student);
        return service.update(photocenter);
    }

    @RequestMapping("/delete/{id}")
    String delete(Model model,
                  @PathVariable("id") String id){
        service.delete(id);
        model.addAttribute("photocenter", service.getAll());
        return "photocenterList";
    }

}

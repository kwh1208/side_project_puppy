package walkway.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import walkway.project.dto.Trail;
import walkway.project.model.service.TrailService;

import java.util.List;

@Controller
public class TrailController {

    @Autowired
    private TrailService service;

    @GetMapping("/list")
    public String thymeleaf(Model model){
        List<Trail> list = service.selectAll();
        model.addAttribute("list",list);
        return "allTrail";
    }
}

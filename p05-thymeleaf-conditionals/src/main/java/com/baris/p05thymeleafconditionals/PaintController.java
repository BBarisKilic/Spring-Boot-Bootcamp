package com.baris.p05thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaintController {

    @GetMapping(value = "/painting")
    public String getPaint(Model model) {
        model.addAttribute("paint", "starry-night");
        return "painting";
    }

}

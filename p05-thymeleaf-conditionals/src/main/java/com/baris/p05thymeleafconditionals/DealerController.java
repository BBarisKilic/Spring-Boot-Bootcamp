package com.baris.p05thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DealerController {
    @GetMapping(value = "/dealership")
    public String getMethodName(Model model) {
        model.addAttribute("budget", 10000);
        model.addAttribute("make", "Volkswagen");
        return "dealership";
    }

}

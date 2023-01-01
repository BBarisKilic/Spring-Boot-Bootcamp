package com.baris.p05thymeleafconditionals;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SignController {
    @GetMapping("/sign")
    public String getSign(Model model) {
        model.addAttribute("speed", 45);
        return "sign";
    }
}

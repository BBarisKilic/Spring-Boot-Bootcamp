package com.baris.p03gradesubmission;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller()
public class GradeController {

    @GetMapping("/grades")
    public String getGrades(Model model) {
        final Grade grade = new Grade("Baris", "Math", "A+");
        model.addAttribute("grade", grade);
        return "grades";
    }
}

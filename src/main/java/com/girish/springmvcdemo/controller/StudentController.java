package com.girish.springmvcdemo.controller;

import com.girish.springmvcdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/show-form")
    private String showForm(Model model){
        model.addAttribute("student", new Student());
        return "student-form";
    }

    @RequestMapping("/process-form")
    private String processForm(@ModelAttribute("student") Student student){
        return "student-confirmation";
    }
}

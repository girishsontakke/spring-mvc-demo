package com.girish.springmvcdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/home")
public class HomeController {

    @RequestMapping("")
    protected String homeController(){
        return "index";
    }

    @RequestMapping("/name-form")
    protected String showForm(){
        return "nameform";
    }

    @RequestMapping("/process-form")
    protected String processForm(HttpServletRequest request, Model model){
        String name = request.getParameter("name");
        name = name.toUpperCase();
        model.addAttribute("name", name);
        return "processform";
    }

    @RequestMapping("/process-form-2")
    protected String processFormTwo(@RequestParam("name") String name, Model model){
        name += "!!";
        model.addAttribute("name", name);
        return "processform";
    }
}

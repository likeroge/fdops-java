package ru.egodev21.fdops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("home")
    public String homePage(Model model){
        model.addAttribute("name", "Developer");
        return "home";
    }
//    @GetMapping("welcome")
    @GetMapping("/")
    public String welcomePage(Model model){
        model.addAttribute("data", "Welcome!");
        return "welcome";
    }
}

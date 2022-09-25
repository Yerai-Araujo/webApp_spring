package com.example.webApp.controller;

import com.example.webApp.service.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {


    @RequestMapping("/index")
    public String home(@RequestParam(required = false) String color,
                       @RequestParam(required = false) String name,
                       Model page) {
        page.addAttribute("username", name);
        page.addAttribute("color", color);
        return "index.html";
    }

    @RequestMapping("/index/{color}")
    public String home(@PathVariable String color,
                       Model page) {
        page.addAttribute("username", "Paco");
        page.addAttribute("color", color);
        return "index.html";
    }
}

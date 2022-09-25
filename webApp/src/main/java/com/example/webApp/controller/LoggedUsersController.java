package com.example.webApp.controller;

import com.example.webApp.model.User;
import com.example.webApp.service.LoggedUserManagementService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoggedUsersController {

    private final LoggedUserManagementService loggedService;

    public LoggedUsersController(LoggedUserManagementService loggedService) {
        this.loggedService = loggedService;
    }



    @GetMapping("/main")
    public String home(
            @RequestParam(required = false) String logout,
            Model model
    ) {
        if(logout!=null)
            loggedService.setUsername(null);

        String username = loggedService.getUsername();

        if(username==null)
            return "redirect:/";

        model.addAttribute("username", username);
        return "main.html";
    }
}

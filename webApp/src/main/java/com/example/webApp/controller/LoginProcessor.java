package com.example.webApp.controller;

import com.example.webApp.service.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class LoginProcessor {

    private final LoggedUserManagementService loggedService;
    private String username;
    private String password;

    public LoginProcessor(LoggedUserManagementService loggedService) {
        this.loggedService = loggedService;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean login() {
        boolean result = false;

        if("Usuario1".equals(username) &&
                "1234".equals(password)) {
            result = true;
            loggedService.setUsername(username);
        }

        return result;
    }
}

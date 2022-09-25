package com.example.webApp.model;

import com.example.webApp.service.LoggedUserManagementService;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class User {

    private String username;
    private String password;
    private final LoggedUserManagementService loggedService;

    public User(LoggedUserManagementService loggedService) {
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


}

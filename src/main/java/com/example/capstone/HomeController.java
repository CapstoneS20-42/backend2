package com.example.capstone;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    User users;

    @Autowired
    Register register;

    @GetMapping("/api/home")
    public String home() {
        return ("<h1>Welcome</h1>");
    }
    
    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome User</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome Admin</h1>");
    }

    @GetMapping("/api/users")
    public List<String> getAllUsernames() {
        return users.getAllUsers();
    }

    @GetMapping("/api/register")
    public String registerStudent() {
        return register.registerUser("ez123"); //Get netid from frontend
    }

    @GetMapping("/api/firstLogin")
    public String firstLogin() {
        return register.registerUser("ez123"); //Get netid from frontend
    }
   
}
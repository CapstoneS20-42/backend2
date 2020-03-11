package com.example.capstone;

import java.util.*;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/", produces=MediaType.APPLICATION_JSON_VALUE)
public class HomeController {

    // @Autowired
    // User users;
    
    @GetMapping("/api/home")
    public String home() {
        return ("Welcome");
    }
    
    @GetMapping("/api/user")
    public String user() {
        return ("Welcome User");
    }

    @GetMapping("/api/admin")
    public String admin() {
        return ("Welcome Admin");
    }

    @PostMapping(value = "/api/login", produces = MediaType.APPLICATION_JSON_VALUE)
    public String register(@RequestBody User user) {
        
        System.out.println("User object: " + user);
        System.out.println("Username is: " + user.getUsername());
        System.out.println("Password is: " + user.getPassword());
        
        return user.toString();
    }

    /*
    @GetMapping("/api/users")
    public List<String> getAllUsernames() {
        return users.getAllUsers();
    }
    */
   
}
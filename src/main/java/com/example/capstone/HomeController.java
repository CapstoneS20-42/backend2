package com.example.capstone;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @Autowired
    User users;
    
    @GetMapping("/api/home")
    public String home() {
        return "HOME!";
    }

    @GetMapping("/api/users")
    public List<String> getAllUsernames() {
        return users.getAllUsers();
	}
   
}
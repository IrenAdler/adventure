package com.project.adventure.controller;

import com.project.adventure.domain.User;
import com.project.adventure.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.Map;


@Controller
public class AdventureController {
    @Autowired
    private UserRepository userRepository;
    @GetMapping("/traveling")
    public String traveling(@RequestParam(name="name", required=false, defaultValue="World") String name, Map<String, Object> model) {
        model.put("users", "");
        return "traveling";
    }

    @GetMapping
    public String main(Map<String, Object> model){
        Iterable<User> users = userRepository.findAll();
        model.put("users", users);
        return "main";
    }

    @PostMapping
    public String add(@RequestParam String nameUser, @RequestParam String emailUser, Map<String, Object> model){
        User user = new User(nameUser, emailUser);
        userRepository.save(user);
        Iterable<User> users = userRepository.findAll();
        model.put("users", users);
        return "main";
    }
}
package com.project.adventure.controller;


import com.project.adventure.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.Map;


@Controller

@EntityScan(basePackages = "com.project.adventure.repository")

public class UserController{

    private final UserRepos userRepos;

    @Autowired
    public UserController(UserRepos userRepos) {
        this.userRepos = userRepos;
    }
    @GetMapping("/traveling")
    public ResponseEntity<String> traveling(@RequestParam(name="name", required=false, defaultValue="World") String name) {
        return new ResponseEntity<String>("traveling", HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<String> main(){
        return new ResponseEntity<String>("default", HttpStatus.OK);
    }

    @PostMapping
    public String add(@RequestParam String nameUser, @RequestParam String emailUser, Map<String, Object> model){
        User user = new User(nameUser, emailUser);
        userRepos.save(user);
        Iterable<User> users = userRepos.findAll();
        model.put("users", users);
        return "main";
    }
}
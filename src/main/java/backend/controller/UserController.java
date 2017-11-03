package backend.controller;


import backend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import backend.service.UserService;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.awt.*;
import java.util.List;

@RestController
@EnableWebMvc
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/users")
    public List<User> getUser(){
        return userService.getAll();
    }

    @PostMapping(value="/users")
    public void addUser(@RequestBody User user){
        userService.addUser(user);

    }
}

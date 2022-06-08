package com.meli.interview.back.subscription_api.user.controllers;

import com.meli.interview.back.subscription_api.user.domain.User;
import com.meli.interview.back.subscription_api.user.services.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

@RestController
@SessionAttributes("user")
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/users")
    public User createUser(User user) {
        return userService.createUser(user);
    }

    @GetMapping("/list")
    public List<User> list() {
        return userService.list();
    }

}

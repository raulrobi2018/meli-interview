package com.meli.interview.back.subscription_api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;

@Controller
@SessionAttributes("user")
@RequestMapping("/users")
public class UserController {

    @Autowired
    private IUserDAO userDao;

    @PostMapping(value = "/")
    public String createUser(User user) {
        userDao.createUser(user);
        return "usersScreen";
    }

    @GetMapping(value = "/list")
    public String list() {
        userDao.list();
        return "usersList";
    }

}

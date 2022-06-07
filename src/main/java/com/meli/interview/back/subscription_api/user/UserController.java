package com.meli.interview.back.subscription_api.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private IUserDAO userDao;

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public String createUser(User user) {
        userDao.createUser(user);
        return "users";
    }

}

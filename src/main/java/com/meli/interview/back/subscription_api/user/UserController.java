package com.meli.interview.back.subscription_api.user;

import com.meli.interview.back.subscription_api.session.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {
    
    @Autowired
    private IUserDAO userDao;
    
    @RequestMapping(value = "/form", method = RequestMethod.POST)
    public String createUser(String id, String name) {
        userDao.createUser(user);
        User user = new User();
        user.setId(id);
        user.setName(name);
        return "form";
    }

}

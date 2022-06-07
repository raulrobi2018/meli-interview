package com.meli.interview.back.subscription_api.user;

import com.meli.interview.back.subscription_api.session.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    
    @PostMapping
    public String createUser(String id, String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        return "form";
    }

}

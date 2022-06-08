package com.meli.interview.back.subscription_api.user.services;

import com.meli.interview.back.subscription_api.user.domain.User;
import com.meli.interview.back.subscription_api.user.dao.UserDAO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public User createUser(User user) {
        return userDAO.createUser(user);
    }
    
    public List<User> list() {
        return userDAO.list();
    }

}

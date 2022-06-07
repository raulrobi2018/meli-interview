/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meli.interview.back.subscription_api.user;

import com.meli.interview.back.subscription_api.session.User;
import javax.persistence.EntityManager;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Raul Rodriguez
 */
@Repository
public class UserDAO implements IUserDAO{
    
    private EntityManager em;
    
    @Override
    public User createUser(String id, String name) {
        return new User(id, name);
    }
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meli.interview.back.subscription_api.user.dao;
import com.meli.interview.back.subscription_api.user.domain.User;
import java.util.List;

/**
 *
 * @author Raul Rodriguez
 */
public interface IUserDAO {
    public User createUser(User user);

    public List<User> list();
}

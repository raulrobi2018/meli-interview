/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meli.interview.back.subscription_api.user;

import com.meli.interview.back.subscription_api.session.User;

/**
 *
 * @author Raul Rodriguez
 */
public interface IUserDAO {
    public User createUser(String id, String name);
}
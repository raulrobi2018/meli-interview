/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meli.interview.back.subscription_api.subscription;

import com.meli.interview.back.subscription_api.user.User;

/**
 *
 * @author Raul Rodriguez
 */
public interface ISubscription {
    public Float getUserSubscriptionsCost(User user);
    
}

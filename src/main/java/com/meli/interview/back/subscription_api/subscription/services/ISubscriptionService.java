/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.meli.interview.back.subscription_api.subscription.services;

import com.meli.interview.back.subscription_api.user.domain.User;

/**
 *
 * @author rrodriguez
 */
public interface ISubscriptionService {
    public Float getUserSubscriptionsCost(User user);
}

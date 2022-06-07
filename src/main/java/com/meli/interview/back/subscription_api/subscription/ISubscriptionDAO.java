/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meli.interview.back.subscription_api.subscription;

import com.meli.interview.back.subscription_api.user.User;
import java.util.List;

/**
 *
 * @author Raul Rodriguez
 */
public interface ISubscriptionDAO {
    public List<Subscription> findSubscriptionsByUser(User user);
}

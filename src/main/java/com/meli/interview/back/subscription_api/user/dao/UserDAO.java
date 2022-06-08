/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.meli.interview.back.subscription_api.user.dao;

import com.meli.interview.back.subscription_api.user.domain.User;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;
import java.util.List;

/**
 *
 * @author Raul Rodriguez
 */
@Repository
public class UserDAO implements IUserDAO{
    
    @PersistenceContext
    private EntityManager em;
    
    @Override
    @Transactional
    public User createUser(User user) {
        em.persist(user);
        return user;
    }

    @Override
    @Transactional
    public List<User> list() {
        return em.createQuery("from User").getResultList(); 
    }
    
}

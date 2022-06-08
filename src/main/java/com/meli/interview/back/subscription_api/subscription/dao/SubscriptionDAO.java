package com.meli.interview.back.subscription_api.subscription.dao;

import com.meli.interview.back.subscription_api.subscription.domain.Subscription;
import com.meli.interview.back.subscription_api.exception.CollaboratorCallException;
import com.meli.interview.back.subscription_api.user.domain.User;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository
public class SubscriptionDAO  implements ISubscriptionDAO{
  
    @PersistenceContext
    private EntityManager em;
    
    @Override
    //No static, plural name, List not Arraylist
    public List<Subscription> findSubscriptionsByUser(User user) {
        try {
          return em.createQuery("from Subscriptions where ").getResultList();
        } catch (Exception e) {
        throw new CollaboratorCallException(
            "TripDAO should not be invoked on an unit test.");
        }        
    }
}

package com.meli.interview.back.subscription_api.subscription;

import com.meli.interview.back.subscription_api.exception.CollaboratorCallException;
import com.meli.interview.back.subscription_api.session.User;

import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class SubscriptionDAO  implements ISubscriptionDAO{
   
    private entity
    
    @Override
    //No static, plural name, List not Arraylist
    public List<Subscription> findSubscriptionsByUser(User user) {
        
        throw new CollaboratorCallException(
            "TripDAO should not be invoked on an unit test.");
    }
}

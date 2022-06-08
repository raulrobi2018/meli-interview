package com.meli.interview.back.subscription_api.subscription.services;

import com.meli.interview.back.subscription_api.subscription.domain.Subscription;
import com.meli.interview.back.subscription_api.exception.UserNotLoggedInException;
import com.meli.interview.back.subscription_api.user.domain.User;
import com.meli.interview.back.subscription_api.session.UserSession;
import com.meli.interview.back.subscription_api.subscription.dao.SubscriptionDAO;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService implements ISubscriptionService {

    @Autowired
    private SubscriptionDAO subDAO;
    
    /**
     * Devuelve el costo total de las suscripciones de un usuario siempre que el
     * usuario que esta logueado se encuentre en su lista de amigos
     *
     * @param user
     * @return costo total de la suscripciones del user
     * @throws UserNotLoggedInException si no hay un usuario logueado
     */
    @Override
    public Float getUserSubscriptionsCost(User user) throws UserNotLoggedInException {
        float totalPrice = 0;

        //Codigo controlado por try-catch
        try {

            // get logged user
            User loggedUser = UserSession.getInstance().getLoggedUser();
            boolean isFriend = false;
            if (loggedUser != null) {
                for (User friend : user.getFriends()) {
                    //Usar equals, no operador de comparacion == si es un string
                    //Se controla el id del usuario logueado con el del friend            
                    if (friend.getId() == loggedUser.getId()) {
                        isFriend = true;
                        break;
                    }
                }

                if (isFriend) {
                    List<Subscription> subscriptionList = subDAO.findSubscriptionsByUser(user);
                    
                    //Solo si isFriend=true va a cargar la lista de subcriptions
                    for (Subscription subscription : subscriptionList) {
                        totalPrice += subscription.getPrice();
                    }
                }
            }
        } catch (Exception e) {
            throw new UserNotLoggedInException();
        }

        return totalPrice;
    }
}

package com.meli.interview.back.subscription_api.subscription;

import com.meli.interview.back.subscription_api.exception.UserNotLoggedInException;
import com.meli.interview.back.subscription_api.session.User;
import com.meli.interview.back.subscription_api.session.UserSession;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class SubscriptionService implements ISubscription {

    @Autowired
    private SubscriptionDAO subDAO;
    
    /**
     * Devuelve el costo total de las suscripciones de un usuario siempre que el
     * usuario que estÃ© logueado se encuentre en su lista de amigos
     *
     * @param user
     * @return costo total de la suscripciones del user
     * @throws UserNotLoggedInException si no hay un usuario logueado
     */
    @Override
    public Float getUserSubscriptionsCost(User user) throws UserNotLoggedInException {
        float totalPrice = 0;

        //Código controlado por try-catch
        try {

            // get logged user
            User loggedUser = UserSession.getInstance().getLoggedUser();
            boolean isFriend = false;
            if (loggedUser != null) {
                for (User friend : user.getFriends()) {
                    //Usar equals, no operador de comparación ==
                    //Se controla el id del usuario logueado con el del friend            
                    if (friend.getId().equals(loggedUser.getId())) {
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

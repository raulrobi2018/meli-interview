package com.meli.interview.back.subscription_api.session;

import com.meli.interview.back.subscription_api.subscription.Subscription;
import java.io.Serializable;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

    //Este atributo es mejor que sea long
    @Id
    @Column(name = "id")
    private String id;
    
    @Column(name="user_name")
    private String name;

    //No inicializar arrays a menos que se quieran crear una única vez
    private List<Subscription> subscriptions;
    private List<User> friends;

    public List<User> getFriends() {
        return friends;
    }

    public void addFriend(User user) {
        friends.add(user);
    }

    public void addSubscription(Subscription trip) {
        subscriptions.add(trip);
    }

    public List<Subscription> subscriptions() {
        return subscriptions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

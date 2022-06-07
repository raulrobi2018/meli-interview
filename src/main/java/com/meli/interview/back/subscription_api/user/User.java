package com.meli.interview.back.subscription_api.user;

import com.meli.interview.back.subscription_api.subscription.Subscription;
import java.io.Serializable;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

    //Este atributo es mejor que sea long
    @Id
    @Column(name = "id")
    private long id;
    
    @Column(name="user_name")
    private String name;

    //No inicializar arrays a menos que se quieran crear una unica vez
    @OneToMany
    @JoinColumn(nullable = true, name = "comprobante_id")
    private List<Subscription> subscriptions;
    
    @OneToMany
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

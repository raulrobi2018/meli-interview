package com.meli.interview.back.subscription_api.user.domain;

import com.meli.interview.back.subscription_api.subscription.domain.Subscription;
import java.io.Serializable;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "users")
public class User implements Serializable {

    //Este atributo es mejor que sea long o int
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    //@Column(name = "user_name")
    private String name;

    //No inicializar arrays a menos que se quieran crear una unica vez
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    //@JoinColumn(name = "subscriptions_id", nullable = false)
    private List<Subscription> subscriptions;

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    //@JoinColumn(name = "friends_id", nullable = false)
    private List<User> friends;

    public List<User> getFriends() {
        return friends;
    }

    public void setFriends(List<User> friends) {
        this.friends = friends;
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

    public List<Subscription> getSubscriptions() {
        return subscriptions;
    }

    public void setSubscriptions(List<Subscription> subscriptions) {
        this.subscriptions = subscriptions;
    }

    public void setName(String name) {
        this.name = name;
    }
}

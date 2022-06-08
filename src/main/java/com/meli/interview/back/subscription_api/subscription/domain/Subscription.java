package com.meli.interview.back.subscription_api.subscription.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subscriptions")
public class Subscription {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    @Column(name = "partner")
    private String partner;

    public float getPrice() {
        float price = 0;
        if (partner.equals("disney")) {
            price = 100;
        }

        if (partner.equals("netflix")) {
            price = 200;
        }

        if (partner.equals("spotify")) {
            price = 50;
        } else {
            price = 0;
        }

        return price;
     }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }
    
    
}

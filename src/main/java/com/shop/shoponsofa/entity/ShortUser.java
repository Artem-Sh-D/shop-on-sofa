package com.shop.shoponsofa.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class ShortUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String phoneNumber;

    @OneToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    @OneToMany
    @JoinColumn(name = "order_id")
    private Set<Order> order;

    public ShortUser() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}

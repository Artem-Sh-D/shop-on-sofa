package com.shop.shoponsofa.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @JoinColumn(name = "buyItems_id")
    private Set<BuyItem> buyItems;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Cart() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<BuyItem> getBuyItems() {
        return buyItems;
    }

    public void setBuyItems(Set<BuyItem> buyItems) {
        this.buyItems = buyItems;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}

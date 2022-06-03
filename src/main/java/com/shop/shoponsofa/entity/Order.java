package com.shop.shoponsofa.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ORDERS")
public class Order {
    //дропаем ордер, дропаем и байайтемс
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numberOrder;

    @OneToMany
    @JoinColumn(name = "buyItems_id")
    private Set<BuyItem> buyItems;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Order() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(String numberOrder) {
        this.numberOrder = numberOrder;
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

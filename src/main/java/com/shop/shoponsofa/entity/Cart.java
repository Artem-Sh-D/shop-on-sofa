package com.shop.shoponsofa.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private Set<BuyItem> buyItems;

    @OneToOne()
    private User user;

    public Cart() {
    }


}

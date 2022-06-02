package com.shop.shoponsofa.entity;

import com.shop.shoponsofa.dto.BuyItem;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private List<BuyItem> buyItems;

    @OneToOne()
    private User user;

    public Cart() {
    }


}

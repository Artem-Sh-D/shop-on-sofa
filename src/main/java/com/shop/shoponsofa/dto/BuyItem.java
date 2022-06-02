package com.shop.shoponsofa.dto;


import com.shop.shoponsofa.entity.Goods;

public class BuyItem {

    private Goods goods;
    private Integer amount;

    public BuyItem(Goods goods, Integer amount) {
        this.goods = goods;
        this.amount = amount;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

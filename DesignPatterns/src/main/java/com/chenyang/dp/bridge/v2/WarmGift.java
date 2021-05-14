package com.chenyang.dp.bridge.v2;

public class WarmGift extends Gift {
    public WarmGift(Product product) {
        this.product = product;
    }

    @Override
    public void give() {
        System.out.println("温暖的...");
        product.make();
    }
}

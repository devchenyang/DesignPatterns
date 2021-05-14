package com.chenyang.dp.bridge.v2;

public class WildGift extends Gift {
    public WildGift(Product product) {
        this.product = product;
    }

    @Override
    public void give() {
        System.out.println("疯狂的...");
        product.make();
    }
}

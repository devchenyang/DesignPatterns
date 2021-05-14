package com.chenyang.dp.bridge.v2;

public class Main {
    public static void main(String[] args) {
        Gift g = new WarmGift(new Book());
        g.give();
    }
}

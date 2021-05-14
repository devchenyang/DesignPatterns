package com.chenyang.dp.bridge.v2;

public class Book implements Product {
    @Override
    public void make() {
        System.out.println("这是一本书...");
    }
}

package com.chenyang.dp.factorymethod;

public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("car is moving...");
    }
}

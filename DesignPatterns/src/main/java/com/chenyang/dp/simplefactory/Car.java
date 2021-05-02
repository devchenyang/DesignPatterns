package com.chenyang.dp.simplefactory;

public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("car is moving...");
    }
}

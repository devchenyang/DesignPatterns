package com.chenyang.dp.simplefactory.impl;

import com.chenyang.dp.simplefactory.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("car is moving...");
    }
}

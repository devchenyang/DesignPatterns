package com.chenyang.dp.factorymethod.impl;

import com.chenyang.dp.factorymethod.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("car is moving...");
    }
}

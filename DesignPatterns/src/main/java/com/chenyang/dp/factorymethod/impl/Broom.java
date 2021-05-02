package com.chenyang.dp.factorymethod.impl;

import com.chenyang.dp.factorymethod.interfaces.Vehicle;

public class Broom implements Vehicle {
    @Override
    public void go() {
        System.out.println("broom is flying...");
    }
}

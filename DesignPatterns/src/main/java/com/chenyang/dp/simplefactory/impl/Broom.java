package com.chenyang.dp.simplefactory.impl;

import com.chenyang.dp.simplefactory.interfaces.Vehicle;

public class Broom implements Vehicle {
    @Override
    public void go() {
        System.out.println("broom is flying...");
    }
}

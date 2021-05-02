package com.chenyang.dp.abstractfactory.implmodern;

import com.chenyang.dp.abstractfactory.interfaces.Vehicle;

public class Car implements Vehicle {
    @Override
    public void go() {
        System.out.println("car is moving...");
    }
}

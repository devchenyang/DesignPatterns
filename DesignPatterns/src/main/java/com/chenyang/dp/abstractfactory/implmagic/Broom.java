package com.chenyang.dp.abstractfactory.implmagic;

import com.chenyang.dp.abstractfactory.interfaces.Vehicle;

public class Broom implements Vehicle {
    @Override
    public void go() {
        System.out.println("broom is flying...");
    }
}

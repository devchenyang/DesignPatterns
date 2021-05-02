package com.chenyang.dp.abstractfactory.implmagic;

import com.chenyang.dp.abstractfactory.interfaces.Food;

public class Mushroom implements Food {
    @Override
    public void printName() {
        System.out.println("dmg");
    }
}

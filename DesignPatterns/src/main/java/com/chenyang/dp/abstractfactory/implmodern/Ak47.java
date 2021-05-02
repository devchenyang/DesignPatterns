package com.chenyang.dp.abstractfactory.implmodern;

import com.chenyang.dp.abstractfactory.interfaces.Weapon;

public class Ak47 implements Weapon {
    @Override
    public void shoot() {
        System.out.println("tututu...");
    }
}

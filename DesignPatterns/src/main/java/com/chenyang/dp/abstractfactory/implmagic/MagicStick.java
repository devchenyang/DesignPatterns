package com.chenyang.dp.abstractfactory.implmagic;

import com.chenyang.dp.abstractfactory.interfaces.Weapon;

public class MagicStick implements Weapon {
    @Override
    public void shoot() {
        System.out.println("diandiandian...");
    }
}

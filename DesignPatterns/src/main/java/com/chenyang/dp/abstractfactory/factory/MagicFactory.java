package com.chenyang.dp.abstractfactory.factory;

import com.chenyang.dp.abstractfactory.implmagic.Broom;
import com.chenyang.dp.abstractfactory.implmagic.MagicStick;
import com.chenyang.dp.abstractfactory.implmagic.Mushroom;
import com.chenyang.dp.abstractfactory.interfaces.Food;
import com.chenyang.dp.abstractfactory.interfaces.Vehicle;
import com.chenyang.dp.abstractfactory.interfaces.Weapon;

public class MagicFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    public Weapon createWeapon() {
        return new MagicStick();
    }

    @Override
    public Food createFood() {
        return new Mushroom();
    }
}

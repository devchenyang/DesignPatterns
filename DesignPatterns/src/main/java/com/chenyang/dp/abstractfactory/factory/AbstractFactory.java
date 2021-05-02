package com.chenyang.dp.abstractfactory.factory;

import com.chenyang.dp.abstractfactory.interfaces.Food;
import com.chenyang.dp.abstractfactory.interfaces.Vehicle;
import com.chenyang.dp.abstractfactory.interfaces.Weapon;

public abstract class AbstractFactory {
    public abstract Vehicle createVehicle();
    public abstract Weapon createWeapon();
    public abstract Food createFood();
}

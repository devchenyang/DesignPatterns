package com.chenyang.dp.abstractfactory.factory;

import com.chenyang.dp.abstractfactory.implmodern.Ak47;
import com.chenyang.dp.abstractfactory.implmodern.Bread;
import com.chenyang.dp.abstractfactory.implmodern.Car;
import com.chenyang.dp.abstractfactory.interfaces.Food;
import com.chenyang.dp.abstractfactory.interfaces.Vehicle;
import com.chenyang.dp.abstractfactory.interfaces.Weapon;

public class ModernFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }

    @Override
    public Weapon createWeapon() {
        return new Ak47();
    }

    @Override
    public Food createFood() {
        return new Bread();
    }
}

package com.chenyang.dp.abstractfactory;

import com.chenyang.dp.abstractfactory.factory.AbstractFactory;
import com.chenyang.dp.abstractfactory.factory.MagicFactory;
import com.chenyang.dp.abstractfactory.factory.ModernFactory;
import com.chenyang.dp.abstractfactory.interfaces.Food;
import com.chenyang.dp.abstractfactory.interfaces.Vehicle;
import com.chenyang.dp.abstractfactory.interfaces.Weapon;

public class Main {
    public static void main(String[] args) {
        AbstractFactory modernFactory = new ModernFactory();
        Vehicle car = modernFactory.createVehicle();
        Weapon ak47 = modernFactory.createWeapon();
        Food bread = modernFactory.createFood();

        car.go();
        ak47.shoot();
        bread.printName();

        AbstractFactory magicFactory = new MagicFactory();
        Vehicle broom = magicFactory.createVehicle();
        Weapon magicStick = magicFactory.createWeapon();
        Food mushroom = magicFactory.createFood();

        broom.go();
        magicStick.shoot();
        mushroom.printName();
    }
}

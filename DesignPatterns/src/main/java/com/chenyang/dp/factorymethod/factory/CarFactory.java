package com.chenyang.dp.factorymethod.factory;

import com.chenyang.dp.factorymethod.impl.Car;
import com.chenyang.dp.factorymethod.interfaces.Vehicle;

public class CarFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

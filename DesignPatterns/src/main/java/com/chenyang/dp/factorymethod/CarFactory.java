package com.chenyang.dp.factorymethod;

public class CarFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

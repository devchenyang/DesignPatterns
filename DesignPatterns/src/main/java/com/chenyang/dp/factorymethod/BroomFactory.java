package com.chenyang.dp.factorymethod;

public class BroomFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }
}

package com.chenyang.dp.factorymethod.factory;

import com.chenyang.dp.factorymethod.impl.Broom;
import com.chenyang.dp.factorymethod.interfaces.Vehicle;

public class BroomFactory extends AbstractFactory {

    @Override
    public Vehicle createVehicle() {
        return new Broom();
    }
}

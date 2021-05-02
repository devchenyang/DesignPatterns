package com.chenyang.dp.simplefactory.factory;

import com.chenyang.dp.simplefactory.impl.Broom;
import com.chenyang.dp.simplefactory.impl.Car;
import com.chenyang.dp.simplefactory.interfaces.Vehicle;

public class VehicleFactory {

    public Vehicle createCar() {
        return new Car();
    }

    public Vehicle createBroom() {
        return new Broom();
    }
}

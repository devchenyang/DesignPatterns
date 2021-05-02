package com.chenyang.dp.simplefactory.factory;

import com.chenyang.dp.simplefactory.impl.Broom;
import com.chenyang.dp.simplefactory.impl.Car;
import com.chenyang.dp.simplefactory.interfaces.Vehicle;

public class VehicleFactory {

    public Vehicle createVehicle(String vehicleName) {
        if (vehicleName == null) {
            return null;
        }
        if (vehicleName.equalsIgnoreCase("Car")) {
            return new Car();
        }
        if (vehicleName.equalsIgnoreCase("Broom")) {
            return new Broom();
        }
        return null;
    }
}

package com.chenyang.dp.simplefactory;

public class VehicleFactory {

    public static Vehicle createVehicle(String vehicleName) {
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

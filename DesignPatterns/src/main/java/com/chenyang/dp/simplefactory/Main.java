package com.chenyang.dp.simplefactory;

import com.chenyang.dp.simplefactory.factory.VehicleFactory;
import com.chenyang.dp.simplefactory.interfaces.Vehicle;

public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.go();
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle broom = vehicleFactory.createBroom();
        broom.go();

        Vehicle car = vehicleFactory.createCar();
        car.go();
    }
}

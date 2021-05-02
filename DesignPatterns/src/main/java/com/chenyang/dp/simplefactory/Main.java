package com.chenyang.dp.simplefactory;

public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.go();
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle broom = vehicleFactory.createVehicle("broom");
        Vehicle car = vehicleFactory.createVehicle("car");
        broom.go();
        car.go();
    }
}

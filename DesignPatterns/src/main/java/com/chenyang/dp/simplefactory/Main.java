package com.chenyang.dp.simplefactory;

public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.go();
        Vehicle broom = VehicleFactory.createVehicle("broom");
        Vehicle car = VehicleFactory.createVehicle("car");
        broom.go();
        car.go();
    }
}

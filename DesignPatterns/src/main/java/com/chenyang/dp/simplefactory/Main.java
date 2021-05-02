package com.chenyang.dp.simplefactory;

public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
//        c.go();
        Vehicle broom = VehicleFactory.createBroom();
        Vehicle car = VehicleFactory.createCar();
        broom.go();
        car.go();
    }
}

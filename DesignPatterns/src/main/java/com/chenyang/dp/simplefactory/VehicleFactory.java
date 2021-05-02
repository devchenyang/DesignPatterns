package com.chenyang.dp.simplefactory;

public class VehicleFactory {

    public static Vehicle createCar() {
        System.out.println("process before creating");
        return new Car();
    }

    public static Vehicle createBroom() {
        System.out.println("process before creating");
        return new Broom();
    }
}

package com.chenyang.dp.factorymethod;

public class Main {
    public static void main(String[] args) {
        AbstractFactory carFactory = new CarFactory();
        AbstractFactory broomFactory = new BroomFactory();
        Vehicle car = carFactory.createVehicle();
        Vehicle broom = broomFactory.createVehicle();

        car.go();
        broom.go();
    }
}

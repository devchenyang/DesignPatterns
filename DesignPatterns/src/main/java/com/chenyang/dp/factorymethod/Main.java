package com.chenyang.dp.factorymethod;

import com.chenyang.dp.factorymethod.factory.AbstractFactory;
import com.chenyang.dp.factorymethod.factory.BroomFactory;
import com.chenyang.dp.factorymethod.factory.CarFactory;
import com.chenyang.dp.factorymethod.interfaces.Vehicle;

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

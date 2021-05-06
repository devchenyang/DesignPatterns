package com.chenyang.dp.proxy.v1;

interface Movable {
    void move();
}

public class Tank implements Movable {

    @Override
    public void move() {

        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

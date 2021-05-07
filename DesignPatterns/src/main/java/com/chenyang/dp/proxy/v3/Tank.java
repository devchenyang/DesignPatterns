package com.chenyang.dp.proxy.v3;

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

    public static void main(String[] args) {
        new TankTimeProxy(new Tank()).move();
    }
}

class TankTimeProxy implements Movable {

    Tank tank;

    public TankTimeProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();

        tank.move();

        long end = System.currentTimeMillis();
        System.out.println(String.format("执行时间：%d毫秒", end - start));
    }
}
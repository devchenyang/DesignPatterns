package com.chenyang.dp.proxy.v4;

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
        new TankLogProxy(
                new TankTimeProxy(
                        new Tank()
                )
        ).move();
    }
}

class TankTimeProxy implements Movable {

    Movable m;

    public TankTimeProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        long start = System.currentTimeMillis();

        m.move();

        long end = System.currentTimeMillis();
        System.out.println(String.format("执行时间：%d毫秒", end - start));
    }
}

class TankLogProxy implements Movable {

    Movable m;

    public TankLogProxy(Movable m) {
        this.m = m;
    }

    @Override
    public void move() {
        System.out.println("start moving...");
        m.move();
        System.out.println("stopped");
    }
}
package com.chenyang.dp.proxy.v1;

interface Movable {
    void move();
}

public class Tank implements Movable {

    @Override
    public void move() {

        long start = System.currentTimeMillis();

        System.out.println("Tank moving claclacla...");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();

        System.out.println(String.format("执行时间：%d毫秒", end - start));
    }

    public static void main(String[] args) {
        new Tank().move();
    }
}

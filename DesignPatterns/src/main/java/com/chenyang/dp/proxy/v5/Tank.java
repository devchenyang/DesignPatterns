package com.chenyang.dp.proxy.v5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
        Tank tank = new Tank();
        Movable m1 = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                Tank.class.getInterfaces(),
                new TankLogHandler(tank));

        Movable m2 = (Movable) Proxy.newProxyInstance(Tank.class.getClassLoader(),
                Tank.class.getInterfaces(),
                new TankTimeHandler(m1));

        m2.move();
    }
}

class TankTimeHandler implements InvocationHandler {

    Movable m;

    public TankTimeHandler(Movable m) {
        this.m = m;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.currentTimeMillis();

        Object o = method.invoke(m, args);

        long end = System.currentTimeMillis();
        System.out.println(String.format("执行时间：%d毫秒", end - start));

        return o;
    }
}

class TankLogHandler implements InvocationHandler {

    Movable m;

    public TankLogHandler(Movable m) {
        this.m = m;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("method" + method.getName() + "start...");
        Object o = method.invoke(m, args);
        System.out.println("method" + method.getName() + "end...");

        return o;
    }
}
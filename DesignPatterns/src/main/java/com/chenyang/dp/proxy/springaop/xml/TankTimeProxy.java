package com.chenyang.dp.proxy.springaop.xml;

public class TankTimeProxy {

    public void before() {
        System.out.println("method start..." + System.currentTimeMillis());
    }

    public void after() {
        System.out.println("method end..." + System.currentTimeMillis());
    }
}
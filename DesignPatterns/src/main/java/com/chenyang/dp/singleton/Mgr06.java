package com.chenyang.dp.singleton;

import java.lang.reflect.Constructor;
import java.util.Random;

/**
 * 单例模式：枚举
 * 用到的时候创建实例，避免了内存浪费，线程安全，不影响多线程效率，也能保证通过反射获取的是同一个实例
 */
public enum Mgr06 {

    INSTANCE;
    private String name = "jack";
    private int age = 10;

    public void m() {
        System.out.println("m" + this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Mgr06 instance = Mgr06.INSTANCE;
                instance.m();
                System.out.println("age: "+instance.getAge());
                instance.setAge(11 + new Random().nextInt(100));
                System.out.println(instance.hashCode());
            }).start();
        }

        // 通过反射获取实例
//        Class<Mgr06> mgr06Class = Mgr06.class;
//        Constructor<Mgr06> constructor = mgr06Class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Mgr06 mgr05 = constructor.newInstance();
//        System.out.println("===" + mgr05.hashCode());
    }
}

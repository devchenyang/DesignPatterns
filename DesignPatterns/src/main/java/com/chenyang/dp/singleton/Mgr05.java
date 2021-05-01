package com.chenyang.dp.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 单例模式：登记式（静态内部类）
 * 用到的时候创建实例，避免了内存浪费，线程安全，不影响多线程效率，但无法保证通过反射获取的也是同一个实例
 */
public class Mgr05 {

    private Mgr05() {
    }

    public void m() {
        System.out.println("m");
    }

    private static class Mgr05Holder {
        private static final Mgr05 INSTANCE = new Mgr05();
    }

    public static Mgr05 getInstance() {
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Mgr05Holder.INSTANCE;
    }

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr05.getInstance().hashCode())
            ).start();
        }

        // 通过反射获取实例
        Class<Mgr05> mgr05Class = Mgr05.class;
        Constructor<Mgr05> constructor = mgr05Class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Mgr05 mgr05 = constructor.newInstance();
        System.out.println("===" + mgr05.hashCode());
    }
}

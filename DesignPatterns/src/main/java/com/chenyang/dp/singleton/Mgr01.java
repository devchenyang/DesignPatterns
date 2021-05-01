package com.chenyang.dp.singleton;

/**
 * 单例模式：饿汉式
 * 类一加载就实例化一个单例，会造成内存浪费，无法保证通过反射获取的也是同一个实例
 */
public class Mgr01 {
    private static final Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {
    }

    public void m() {
        System.out.println("m");

    }

    public static Mgr01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mgr01 mgr011 = Mgr01.getInstance();
        Mgr01 mgr012= Mgr01.getInstance();

        System.out.println(mgr011 == mgr012);
    }
}

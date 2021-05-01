package com.chenyang.dp.singleton;

/**
 * 单例模式：懒汉式加双重校验锁
 * 用到的时候创建实例，避免了内存浪费，多线线程也安全了但效率降低，无法保证通过反射获取的也是同一个实例
 * 实例对象成员变量需要加volatile关键字
 * 实例对象成员变量为null时开始加锁，加锁后再判断一次实例对象是否为空
 */
public class Mgr04 {
    private static volatile Mgr04 INSTANCE;

    private Mgr04() {
    }

    public void m() {
        System.out.println("m");
    }

    public static Mgr04 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mgr04.class) {
                if (INSTANCE == null) {
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    INSTANCE = new Mgr04();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr04.getInstance().hashCode())
            ).start();
        }
    }
}

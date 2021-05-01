package com.chenyang.dp.singleton;

/**
 * 单例模式：懒汉式
 * 用到的时候创建实例，避免了内存浪费但线程不安全，无法保证通过反射获取的也是同一个实例
 */
public class Mgr02 {
    private static Mgr02 INSTANCE;

    private Mgr02() {
    }

    public void m() {
        System.out.println("m");

    }

    public static Mgr02 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr02();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr02.getInstance().hashCode())
            ).start();
        }
    }
}

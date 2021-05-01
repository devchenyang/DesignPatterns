package com.chenyang.dp.singleton;

/**
 * 单例模式：懒汉式加同步锁（synchronized关键字）
 * 用到的时候创建实例，避免了内存浪费，多线线程安全但效率降低，无法保证通过反射获取的也是同一个实例
 */
public class Mgr03 {
    private static Mgr03 INSTANCE;

    private Mgr03() {
    }

    public void m() {
        System.out.println("m");

    }

    public static synchronized Mgr03 getInstance() {
        if (INSTANCE == null) {
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            INSTANCE = new Mgr03();
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() ->
                    System.out.println(Mgr03.getInstance().hashCode())
            ).start();
        }
    }
}

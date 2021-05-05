package com.chenyang.dp.flyweitht;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * 享元模式，减少创建对象的数量，节省内存提高性能
 */
class Bullet {
    public String id = UUID.randomUUID().toString();
    public boolean living = true;

    @Override
    public String toString() {
        return "Bullet{" +
                "id='" + id + '\'' +
                '}';
    }
}

class BulletPool {
    List<Bullet> bullets = new ArrayList<>();
    {
        for (int i = 0; i < 5; i++) {
            Bullet b = new Bullet();
            System.out.println("BulletPool中的子弹id：" + b.id);
            bullets.add(b);
        }
    }

    public Bullet getBullet() {
        int j = new Random().nextInt(5);
        Bullet b = bullets.get(j);
        if (b.living) {
            return b;
        } else {
            return new Bullet();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        BulletPool bulletPool = new BulletPool();

        for (int i = 0; i < 10; i++) {
            System.out.println(bulletPool.getBullet());
        }
    }
}

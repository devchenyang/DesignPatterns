package com.chenyang.dp.observer.v3;

import java.util.ArrayList;
import java.util.List;

/**
 * 所有观察者实现Observer接口，分离观察者与被观察者
 * 被观察者聚合所有观察者
 */
class Child {
    private boolean cry = false;
    List<Observer> observers = new ArrayList<>();

    {
        observers.add(new Dad());
        observers.add(new Mom());
        observers.add(new Dog());
    }

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("wake up! Crying wuwuwu...");
        cry = true;
        for (Observer observer : observers) {
            observer.actionOnWakeUp();
        }
    }
}

interface Observer {
    void actionOnWakeUp();
}

class Dad implements Observer {
    public void feed() {
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp() {
        feed();
    }
}

class Mom implements Observer {
    public void hug() {
        System.out.println("mom hugging...");
    }

    @Override
    public void actionOnWakeUp() {
        hug();
    }
}

class Dog implements Observer {
    public void play() {
        System.out.println("dad playing...");
    }

    @Override
    public void actionOnWakeUp() {
        play();
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

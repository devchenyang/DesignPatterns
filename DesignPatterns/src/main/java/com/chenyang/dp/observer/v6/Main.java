package com.chenyang.dp.observer.v6;

import java.util.ArrayList;
import java.util.List;

/**
 * 事件类实现继承关系，继承获取事件源（被观察者）的方法
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

        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed", this);

        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }
}

abstract class Event<T> {
    abstract T getSource();
}

class WakeUpEvent extends Event<Child>{
    long timeMillis;
    String location;
    Child child;

    public WakeUpEvent() {}

    public WakeUpEvent(long timeMillis, String location, Child child) {
        this.timeMillis = timeMillis;
        this.location = location;
        this.child = child;
    }

    @Override
    Child getSource() {
        return child;
    }
}

interface Observer {
    void actionOnWakeUp(WakeUpEvent event);
}

class Dad implements Observer {
    public void feed() {
        System.out.println("dad feeding...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        feed();
    }
}

class Mom implements Observer {
    public void hug() {
        System.out.println("mom hugging...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        hug();
    }
}

class Dog implements Observer {
    public void play() {
        System.out.println("dad playing...");
    }

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        play();
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

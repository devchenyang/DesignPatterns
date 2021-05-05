package com.chenyang.dp.observer.v4;

import java.util.ArrayList;
import java.util.List;

/**
 * 调用观察者事件反应方法时经常传入事件对象，用来封装被观察事件的属性
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

        WakeUpEvent event = new WakeUpEvent(System.currentTimeMillis(), "bed");

        for (Observer observer : observers) {
            observer.actionOnWakeUp(event);
        }
    }
}

class WakeUpEvent {
    long timeMillis;
    String location;

    public WakeUpEvent() {}

    public WakeUpEvent(long timeMillis, String location) {
        this.timeMillis = timeMillis;
        this.location = location;
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

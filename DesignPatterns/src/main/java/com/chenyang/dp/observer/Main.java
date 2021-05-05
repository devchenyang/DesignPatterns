package com.chenyang.dp.observer;

class Child {
    private boolean cry = false;
    Dad dad = new Dad();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("wake up! Crying wuwuwu...");
        cry = true;
        dad.feed();
    }
}

class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}

package com.chenyang.dp.observer.v2;

class Child {
    private boolean cry = false;
    Dad dad = new Dad();
    Mom mom = new Mom();
    Dog dog = new Dog();

    public boolean isCry() {
        return cry;
    }

    public void wakeUp() {
        System.out.println("wake up! Crying wuwuwu...");
        cry = true;
        dad.feed();
        mom.hug();
        dog.play();
    }
}

class Dad {
    public void feed() {
        System.out.println("dad feeding...");
    }
}

class Mom {
    public void hug() {
        System.out.println("mom hugging...");
    }
}

class Dog {
    public void play() {
        System.out.println("dad playing...");
    }
}

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        child.wakeUp();
    }
}
